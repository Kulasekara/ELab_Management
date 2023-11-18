/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.entities;

/**
 *
 * @author BHARATHA
 */
public class Admins {
    private int adminId;
    private String title;
    private String name;
    private String role;
    private String nic;
    private String phone;
    private String email;
    private String uName;
    private String password;
    private String lastLoggedIn;
    private int loggedIn;
    private int available;

    public Admins(int adminId, String title, String name, String role, String nic, String phone, String email, String uName, String password, String lastLoggedIn, int loggedIn) {
        this.adminId = adminId;
        this.title = title;
        this.name = name;
        this.role = role;
        this.nic = nic;
        this.phone = phone;
        this.email = email;
        this.uName = uName;
        this.password = password;
        this.lastLoggedIn = lastLoggedIn;
        this.loggedIn = loggedIn;
    }
    
    public Admins(String title, String name, String role, String nic, String phone, String email) {
        
        this.title = title;
        this.name = name;
        this.role = role;
        this.nic = nic;
        this.phone = phone;
        this.email = email;
    }
    
    public Admins(int admin_id, String title, String name, String role, int available) {
        this.adminId = admin_id;
        this.title = title;
        this.name = name;
        this.role = role;
        this.available=available;
    }
    

    public Admins(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    public int getAdminId() {
        return adminId;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getNic() {
        return nic;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getuName() {
        return uName;
    }

    public String getPassword() {
        return password;
    }

    public String getLastLoggedIn() {
        return lastLoggedIn;
    }

    public int getLoggedIn() {
        return loggedIn;
    }
    
    public int getAvailable() {
        return available;
    }
    
}
