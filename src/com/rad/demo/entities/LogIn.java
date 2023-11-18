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
public class LogIn {

    private int adminId;
    private String title;
    private String name;
    private String role;
    private String uName;
    private String password;
    private String lastLoggedIn;

    public LogIn(int adminId,String title, String name, String role, String uName, String password) {
        this.adminId = adminId;
        this.title = title;
        this.name = name;
        this.role = role;
        this.uName = uName;
        this.password = password;
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

    public String getuName() {
        return uName;
    }

    public String getPassword() {
        return password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setLastLoggedIn(String lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

}
