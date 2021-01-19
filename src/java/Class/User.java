/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author sarik
 */
public class User {
    private int id;
    private String name;
    private String surname;
    private String username;
    private String pasw;
    private String mail;
    private double bakiye;
    private int userTip;
    
    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(String username, String pasw, int userTip) {
        this.username = username;
        this.pasw = pasw;
        this.userTip = userTip;
    }
    
    public User(int id, String name, String surname, String username, String pasw, String mail, double bakiye) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.pasw = pasw;
        this.mail = mail;
         this.bakiye = bakiye;
    }

    public User(String name, String surname, String username, String pasw, String mail, double bakiye) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.pasw = pasw;
        this.bakiye = bakiye;
        this.mail = mail;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasw() {
        return pasw;
    }

    public void setPasw(String pasw) {
        this.pasw = pasw;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public int getUserTip() {
        return userTip;
    }

    public void setUserTip(int userTip) {
        this.userTip = userTip;
    }
}