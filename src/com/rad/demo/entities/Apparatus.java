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
public class Apparatus {

    private int id;
    private String group;
    private String family;
    private String component;
    private int qty;

    public Apparatus(String group, String family, String component, int qty) {
        this.group = group;
        this.family = family;
        this.component = component;
        this.qty = qty;
    }

    public Apparatus(int id, int qty) {
        this.id = id;
        this.qty = qty;
    }

    public Apparatus(String group, String family, String component) {
        this.group = group;
        this.family = family;
        this.component = component;
    }

    public int getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getFamily() {
        return family;
    }

    public String getComponent() {
        return component;
    }

    public int getQty() {
        return qty;
    }

}
