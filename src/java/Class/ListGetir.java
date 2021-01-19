/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarik
 */
public class ListGetir {
    public List<StokList> getirTumListe(int x) {
        List<StokList> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from stoklistesi where userId=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, x);
            ResultSet rs = psmt.executeQuery();
           while (rs.next()) {
            StokList reh = new StokList(rs.getString("urunAdi"), rs.getFloat("urunFiyat"), rs.getFloat("urunKDV"), rs.getInt("urunAdet"), rs.getDate("tarih"));
            r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
     
    public double bakiyeIste(double x) {
        double r = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from users where id_user=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setDouble(1, x);
            ResultSet rs = psmt.executeQuery();
            if(rs.next()){
                r = rs.getDouble("bakiye");
            }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
    
    public List<Buying> getirAlisListe(int x) {
        List<Buying> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from urunalimi where userIdAlim=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, x);
            ResultSet rs = psmt.executeQuery();

           while (rs.next()) {
             float y = ((rs.getInt("urunUcretAlim")*rs.getFloat("urunKDVAlim"))*rs.getInt("urunAdetAlim"))+(rs.getFloat("urunUcretAlim")*rs.getInt("urunAdetAlim"));

             Buying reh = new Buying(rs.getInt("id"), y, rs.getDate("tarihAlim"));
             r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
    
    public List<Sales> getirSatisListe(int x) {
        List<Sales> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from urunsatisi where urunIdSatis=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, x);
            ResultSet rs = psmt.executeQuery();

           while (rs.next()) {
             float y;
                y = ((rs.getInt("urunUcretSatis")*rs.getFloat("urunKDVSatis"))*rs.getInt("urunAdetSatis"))+(rs.getFloat("urunUcretSatis")*rs.getInt("urunAdetSatis"));
             Sales reh = new Sales(rs.getInt("id"), y, rs.getDate("tarihSatis"));
             r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
    
    public List<StokList> urunGetir(int x) {
        List<StokList> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select urunAdi from stoklistesi where userId=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, x);
            ResultSet rs = psmt.executeQuery();
           while (rs.next()) {
            StokList reh = new StokList(rs.getString("urunAdi"));
            r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
    
    public List<Buying> getirAlisMüsteriListe(int x) {
        List<Buying> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from urunalimi where userIdAlim=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, x);
            ResultSet rs = psmt.executeQuery();
           while (rs.next()) {
             Buying reh = new Buying(rs.getString("urunMusteriAlim"), rs.getString("urunSirketAlim"), rs.getString("urunTelefonAlim"), rs.getDate("tarihAlim"));
             r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
    
    public List<Sales> getirSatisMüsteriListe(int x) {
        List<Sales> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from urunsatisi where urunIdSatis=?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, x);
            ResultSet rs = psmt.executeQuery();
           while (rs.next()) {
             Sales reh = new Sales(rs.getString("urunMusteriSatis"), rs.getString("urunSirketSatis"), rs.getString("urunTelefonSatis"), rs.getDate("tarihSatis"));
             r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
    
    public List<User> usersGetir(){
        List<User> r = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/donemodevi", "root", "1234");
            String query = "Select * from users where tip_user=2";
            PreparedStatement psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
           while (rs.next()) {
            String pass = rs.getString("pass_user");
            StringBuilder sb16 = null; 
                try {
                    MessageDigest messageDigestNesnesi = MessageDigest.getInstance("MD5");
                    messageDigestNesnesi.update(pass.getBytes());
                    byte messageDigestDizisi[] = messageDigestNesnesi.digest();
                    sb16 = new StringBuilder();
                    for (int i = 0; i < messageDigestDizisi.length; i++) {
                        sb16.append(Integer.toString((messageDigestDizisi[i] & 0xff) + 0x100, 16).substring(1));
                    }
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(ListGetir.class.getName()).log(Level.SEVERE, null, ex);
                }
            User reh = new User(rs.getInt("id_user"), rs.getString("name_user"), rs.getString("surname_user"), rs.getString("username_user"), sb16.toString(), rs.getString("email_user"), rs.getDouble("bakiye"));
            r.add(reh);
           }

           } catch (ClassNotFoundException | SQLException e) {}
            return r;
        }
}
