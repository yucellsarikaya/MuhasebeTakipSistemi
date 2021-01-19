/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Class.User;
import Class.Buying;
import Class.Sales;
import Class.StokList;
import java.sql.ResultSet;
/**
 *
 * @author sarik
 */
public class UserDatabase {
    Connection con ;
    
    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    public boolean saveUser(User user){ //Kullanıcı Kayıt
        boolean set = false;
        try{
           //Insert register data to database
           String query = "INSERT INTO users (name_user, surname_user, username_user, pass_user, email_user, bakiye, tip_user) VALUES (?, ?, ?, ?, ?, ?, ?)";
           
           PreparedStatement preStmt = this.con.prepareStatement(query);
           preStmt.setString(1, user.getName());
           preStmt.setString(2, user.getSurname());
           preStmt.setString(3, user.getUsername());
           preStmt.setString(4, user.getPasw());
           preStmt.setString(5, user.getMail());
           preStmt.setDouble(6, user.getBakiye());
           preStmt.setInt(7, 2);          
           preStmt.executeUpdate();
           set = true;
        }catch(Exception e){
        }
        return set;
    }
    
    public boolean userDelete(User user){ //kullanici silme
        boolean set = false;
        try{
           //Insert register data to database
           String query = "delete from users where id_user=?"; //users tablodan silme 
           PreparedStatement preStmt = this.con.prepareStatement(query);
           preStmt.setInt(1, user.getId());          
           int result = preStmt.executeUpdate();
           
           String query1 = "delete from stoklistesi where userId=?"; //stok tablodan silme
           PreparedStatement preStmt1 = this.con.prepareStatement(query1);
           preStmt1.setInt(1, user.getId());          
           int result1 = preStmt1.executeUpdate();
           
           String query2 = "delete from urunalimi where userIdAlim=?"; //urun alimdan silme
           PreparedStatement preStmt2 = this.con.prepareStatement(query2);
           preStmt2.setInt(1, user.getId());          
           int result2 = preStmt2.executeUpdate();
           
           String query3 = "delete from urunsatisi where urunIdSatis=?"; //urun satisindan silme
           PreparedStatement preStmt3 = this.con.prepareStatement(query3);
           preStmt3.setInt(1, user.getId());          
           int result3 = preStmt3.executeUpdate();
           
           set = true;
        }catch(Exception e){
        }
        return set;
    }
    
    public User login(String userName, String pwd, int x){ //Yöetici Girişi
        User usr=null;
        try{
            String query ="select * from users where username_user=? and pass_user=? and tip_user=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, userName);
            pst.setString(2, pwd);
            pst.setInt(3, x);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                usr = new User();
                usr.setId(rs.getInt("id"));
            }   
        }catch(Exception e){
        }
        return usr;
    }
    
    public User login(String userName, String pwd){ //Kullanıcı Girişi
        User usr=null;
        try{
            String query ="select * from users where username_user=? and pass_user=? and tip_user=2";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, userName);
            pst.setString(2, pwd);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                usr = new User();
                usr.setId(rs.getInt("id"));
            }
            
        }catch(Exception e){
        }
        return usr;
    }
    
    public int idAlma(String userName, String pwd){ //session icin id alma
        int id = 0;
        try{
            String query ="select id_user from users where username_user=? and pass_user=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, userName);
            pst.setString(2, pwd);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id_user");
            }
        }catch(Exception e){
            
        }
        return id;
    }
    
    public boolean urunKayit(Buying alim, StokList stokList){ //Stoğa ürün ekleme, alış listesine ekleme, bakiyeden para düşme
        boolean set = false;
        try{
           String query1 = "INSERT INTO stoklistesi (urunAdi, urunFiyat, urunKDV, urunAdet, userId) VALUES (?, ?, ?, ?, ?)";
           
           PreparedStatement preStmt1 = this.con.prepareStatement(query1);
           preStmt1.setString(1, stokList.getUrunAdi());
           preStmt1.setFloat(2, stokList.getUcret());
           preStmt1.setFloat(3, stokList.getKdv());
           preStmt1.setInt(4, stokList.getAdet());
           preStmt1.setInt(5, stokList.getUserId());
           preStmt1.executeUpdate();
           
           String query = "INSERT INTO urunalimi (urunAdiAlim, urunUcretAlim, urunKDVAlim, urunAdetAlim, urunMusteriAlim, urunSirketAlim, urunTelefonAlim, userIdAlim) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
           
           PreparedStatement preStmt = this.con.prepareStatement(query);
           preStmt.setString(1, alim.getUrunAdi());
           preStmt.setFloat(2, alim.getUcret());
           preStmt.setFloat(3, alim.getKdv());
           preStmt.setInt(4, alim.getAdet());
           preStmt.setString(5, alim.getMusteriAdi());
           preStmt.setString(6, alim.getSirketAdi());
           preStmt.setString(7, alim.getTelefon());
           preStmt.setInt(8, alim.getUserId());
           preStmt.executeUpdate();
           
           String query2 = "update users set bakiye=bakiye-? where id_user=?";
           PreparedStatement preStmt2 = this.con.prepareStatement(query2);
           double ucret = ((alim.getUcret() * alim.getKdv()) * alim.getAdet()) + (alim.getUcret() * alim.getAdet());
           preStmt2.setDouble(1, ucret);
           preStmt2.setInt(2, alim.getUserId());
           preStmt2.executeUpdate();
           set = true;
        }catch(Exception e){
        }
        return set;
    }
    
    public boolean urunSatis(Sales satis){ //Urun satis/bakiye artisi
        boolean set = false;
        try{
           //Insert register data to database           
           String query1 = "INSERT INTO urunsatisi (urunAdiSatis, urunUcretSatis, urunKDVSatis, urunAdetSatis, urunMusteriSatis, urunSirketSatis, urunTelefonSatis, urunIdSatis) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
           
           PreparedStatement preStmt1 = this.con.prepareStatement(query1);
           preStmt1.setString(1, satis.getUrunAdi());
           preStmt1.setFloat(2, satis.getUcret());
           preStmt1.setFloat(3, satis.getKdv());
           preStmt1.setInt(4, satis.getAdet());
           preStmt1.setString(5, satis.getMusteriAdi());
           preStmt1.setString(6, satis.getSirketAdi());
           preStmt1.setString(7, satis.getTelefon());
           preStmt1.setInt(8, satis.getUserId());     
           preStmt1.executeUpdate();
           
           String query2 = "update users set bakiye=bakiye+? where id_user=?";
           PreparedStatement preStmt2 = this.con.prepareStatement(query2);
           double ucret = ((satis.getUcret() * satis.getKdv()) * satis.getAdet()) + (satis.getUcret() * satis.getAdet());
           preStmt2.setDouble(1, ucret);
           preStmt2.setInt(2, satis.getUserId());
           preStmt2.executeUpdate();
           
           set = true;
        }catch(Exception e){
        }      
        return set;
    }
    
    public boolean adetKontrol(StokList stok){ //adetDurumu
        boolean set = false;
        try{
            String query ="select urunAdet from stoklistesi where urunAdi=? and userId=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, stok.getUrunAdi());
            pst.setInt(2, stok.getUserId());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               if(stok.getAdet() < rs.getInt("urunAdet")){
                PreparedStatement preStmt = con.prepareStatement("update stoklistesi set urunAdet=? where urunAdi=? and userId=?");
                preStmt.setInt(1, rs.getInt("urunAdet")-stok.getAdet());
                preStmt.setString(2, stok.getUrunAdi());
                preStmt.setInt(3, stok.getUserId());
                int result = preStmt.executeUpdate();
                set = true;
               }else if(stok.getAdet() - rs.getInt("urunAdet") == 0){
                   PreparedStatement preStmt = con.prepareStatement("delete from stoklistesi where urunAdet=? and userId=?");
                   preStmt.setInt(1, stok.getAdet());
                   preStmt.setInt(2, stok.getUserId());
                   int result = preStmt.executeUpdate();
                   set = true;
               }
            }
            
        }catch(Exception e){
        }
        return set;
    }
}
