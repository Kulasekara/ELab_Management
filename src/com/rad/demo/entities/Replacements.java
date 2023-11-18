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
public class Replacements {
    private int lId;
    private int cId;
    private int qty;

    public Replacements(int lId, int cId, int qty) {
        this.lId = lId;
        this.cId = cId;
        this.qty = qty;
    }

    public int getcId() {
        return cId;
    }

    public int getQty() {
        return qty;
    }

    public int getlId() {
        return lId;
    }
    
    
}
