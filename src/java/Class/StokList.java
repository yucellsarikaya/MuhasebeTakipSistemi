/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;

/**
 *
 * @author sarik
 */
public class StokList {
    private String urunAdi;
    private float ucret;
    private float kdv;
    private int adet;
    private Date tarih;
    private int userId;
    
    public StokList() {}

    public StokList(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    
    public StokList(String urunAdi, int adet, int userId) {
        this.urunAdi = urunAdi;
        this.adet = adet;
        this.userId = userId;
    }

    public StokList(String urunAdi, float ucret, float kdv, int adet, Date tarih) {
        this.urunAdi = urunAdi;
        this.ucret = ucret;
        this.kdv = kdv;
        this.adet = adet;
        this.tarih = tarih;
    }

    public StokList(float ucret, float kdv, int userId) {
        this.ucret = ucret;
        this.kdv = kdv;
        this.userId = userId;
    }

    public StokList(String urunAdi, float ucret, float kdv, int adet, int userId) {
        this.urunAdi = urunAdi;
        this.ucret = ucret;
        this.kdv = kdv;
        this.adet = adet;
        this.userId = userId;
    }
    
    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public float getUcret() {
        return ucret;
    }

    public void setUcret(float ucret) {
        this.ucret = ucret;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }
    
    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public float getKdv() {
        return kdv;
    }

    public void setKdv(float kdv) {
        this.kdv = kdv;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
}
