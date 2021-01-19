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
public class Buying {
    private int id;
    private String urunAdi;
    private float ucret;
    private float kdv;
    private int adet;
    private String musteriAdi;
    private String sirketAdi;
    private String telefon;
    private Date tarih;
    private int userId;

    public Buying() {}

    public Buying(String urunAdi, float ucret, float kdv, int adet, String musteriAdi, String sirketAdi, String telefon, int userId) {
        this.urunAdi = urunAdi;
        this.ucret = ucret;
        this.kdv = kdv;
        this.adet = adet;
        this.musteriAdi = musteriAdi;
        this.sirketAdi = sirketAdi;
        this.telefon = telefon;
        this.userId = userId;
    }

    public Buying(String musteriAdi, String sirketAdi, String telefon, Date tarih) {
        this.musteriAdi = musteriAdi;
        this.sirketAdi = sirketAdi;
        this.telefon = telefon;
        this.tarih = tarih;
    }
    
    public Buying(String sirketAdi, Date tarih) {
        this.sirketAdi = sirketAdi;
        this.tarih = tarih;
    }
    
    public Buying(int id, float ucret, Date tarih) {
        this.id = id;
        this.ucret = ucret;
        this.tarih = tarih;
    }

    public Buying(int id, float ucret, int adet, Date tarih) {
        this.id = id;
        this.ucret = ucret;
        this.adet = adet;
        this.tarih = tarih;
    }
   
    public Buying(String urunAdi, String sirketAdi, float ucret, int adet) {
        this.urunAdi = urunAdi;
        this.sirketAdi = sirketAdi;
        this.ucret = ucret;
        this.adet = adet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getKdv() {
        return kdv;
    }

    public void setKdv(float kdv) {
        this.kdv = kdv;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
