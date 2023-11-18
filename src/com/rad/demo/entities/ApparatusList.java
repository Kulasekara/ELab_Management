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
public class ApparatusList {

    private int listId;
    private String studentRegNo;
    private String issuedDate;
    private int received;
    private String receivedDate;
    private int adminsAdminId;

    public ApparatusList(int listId, String studentRegNo, String issuedDate, int received, String receivedDate, int adminsAdminId) {
        this.listId = listId;
        this.studentRegNo = studentRegNo;
        this.issuedDate = issuedDate;
        this.received = received;
        this.receivedDate = receivedDate;
        this.adminsAdminId = adminsAdminId;
    }

    public int getListId() {
        return listId;
    }

    public String getStudentRegNo() {
        return studentRegNo;
    }

    public String getIssuedDate() {
        return issuedDate;
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

    public void setListId(int listId) {
        this.listId = listId;
    }

}
