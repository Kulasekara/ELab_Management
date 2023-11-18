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
public class ListItems {

    private int listListId;
    private int apparatusApparatusId;
    private int qty;
    private int received;
    private String receivedDate;
    private int adminsAdminId;

    public ListItems(int listListId, int apparatusApparatusId, int qty, int received, String receivedDate, int adminsAdminId) {
        this.listListId = listListId;
        this.apparatusApparatusId = apparatusApparatusId;
        this.qty = qty;
        this.received = received;
        this.receivedDate = receivedDate;
        this.adminsAdminId = adminsAdminId;
    }

    public int getListListId() {
        return listListId;
    }

    public int getApparatusApparatusId() {
        return apparatusApparatusId;
    }

    public int getQty() {
        return qty;
    }

    public int getReceived() {
        return received;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public int getAdminsAdminId() {
        return adminsAdminId;
    }

}
