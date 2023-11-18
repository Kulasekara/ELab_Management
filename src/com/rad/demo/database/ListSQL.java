/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.database;

import com.rad.demo.database.utils.Connect;
import com.rad.demo.entities.ApparatusList;
import com.rad.demo.entities.ListItems;
import com.rad.demo.entities.Replacements;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHARATHA
 */
public class ListSQL {

    private static final Connect c = new Connect();

    public static final ApparatusList addApperatusList(ApparatusList list) {
        try {
            String query = "INSERT INTO List (student_reg_no,issued_date,received,received_date,Admins_admin_id) VALUES ("
                    + "'" + list.getStudentRegNo() + "',"
                    + "'" + list.getIssuedDate() + "',"
                    + "'" + list.getReceived() + "',"
                    + "'" + list.getReceivedDate() + "',"
                    + "'" + list.getAdminsAdminId() + "'"
                    + ")";

            int id = c.setQuery(query, "");
            c.Conn().close();
            System.out.println("Connection closed");
            list.setListId(id);
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
        return list;
    }

    public static final void addListItems(ListItems list) {
        try {
            String query = "INSERT INTO List_has_apparatus (List_list_id,Apparatus_apparatus_id,qty,received,received_date,Admins_admin_id) VALUES ("
                    + "'" + list.getListListId() + "',"
                    + "'" + list.getApparatusApparatusId() + "',"
                    + "'" + list.getQty() + "',"
                    + "'" + list.getReceived() + "',"
                    + "'" + list.getReceivedDate() + "',"
                    + "'" + list.getAdminsAdminId() + "'"
                    + ")";

            c.setQuery(query, "");
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final void addNewItems(int id,String group1, String family, String component, int qty){
        try {
            String query = "INSERT INTO Apparatus (apparatus_id,groupz,family,component,qty) VALUES ("
                    + "'" + id + "',"
                    + "'" + group1 + "',"
                    + "'" + family+ "',"
                    + "'" + component+ "',"
                    + "'" + qty+ "'"
                    + ")";

            c.setQuery(query, "");
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    public static final void setQty(int id, int qty) {
        try {
            String query = "UPDATE Apparatus SET qty = '" + qty + "' WHERE Apparatus.apparatus_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final List<ApparatusList> getNotCompletedLists() throws SQLException {

        List<ApparatusList> apparatusList = new ArrayList<>();

        String query = "SELECT list_id,student_reg_no,issued_date,received,received_date,Admins_admin_id FROM List WHERE received = '0' ORDER BY issued_date DESC";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int listId = rset.getInt("list_id");
                String studentRegNo = rset.getString("student_reg_no");
                String issuedDate = rset.getString("issued_date");
                int status = rset.getInt("received");
                String receivedDate = rset.getString("received_date");
                int adminsAdminId = rset.getInt("Admins_admin_id");

                ApparatusList temp = new ApparatusList(listId, studentRegNo, issuedDate, status, receivedDate, adminsAdminId);
                apparatusList.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatusList;
    }

    public static final List<ApparatusList> getAllLists() throws SQLException {

        List<ApparatusList> apparatusList = new ArrayList<>();

        String query = "SELECT list_id,student_reg_no,issued_date,received,received_date,Admins_admin_id FROM List ORDER BY issued_date DESC";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int listId = rset.getInt("list_id");
                String studentRegNo = rset.getString("student_reg_no");
                String issuedDate = rset.getString("issued_date");
                int status = rset.getInt("received");
                String receivedDate = rset.getString("received_date");
                int adminsAdminId = rset.getInt("Admins_admin_id");

                ApparatusList temp = new ApparatusList(listId, studentRegNo, issuedDate, status, receivedDate, adminsAdminId);
                apparatusList.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatusList;
    }

    public static final List<ApparatusList> getNotCompletedListsByRegNo(String regNo) throws SQLException {

        List<ApparatusList> apparatusList = new ArrayList<>();

        String query = "SELECT list_id,student_reg_no,issued_date,received,received_date,Admins_admin_id FROM List WHERE student_reg_no = '" + regNo + "' AND received = '0' ORDER BY issued_date DESC";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int listId = rset.getInt("list_id");
                String studentRegNo = rset.getString("student_reg_no");
                String issuedDate = rset.getString("issued_date");
                int status = rset.getInt("received");
                String receivedDate = rset.getString("received_date");
                int adminsAdminId = rset.getInt("Admins_admin_id");

                ApparatusList temp = new ApparatusList(listId, studentRegNo, issuedDate, status, receivedDate, adminsAdminId);
                apparatusList.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatusList;
    }

    public static final List<ApparatusList> getAllListsByRegNo(String regNo) throws SQLException {

        List<ApparatusList> apparatusList = new ArrayList<>();

        String query = "SELECT list_id,student_reg_no,issued_date,received,received_date,Admins_admin_id FROM List WHERE student_reg_no = '" + regNo + "' ORDER BY issued_date DESC";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int listId = rset.getInt("list_id");
                String studentRegNo = rset.getString("student_reg_no");
                String issuedDate = rset.getString("issued_date");
                int status = rset.getInt("received");
                String receivedDate = rset.getString("received_date");
                int adminsAdminId = rset.getInt("Admins_admin_id");

                ApparatusList temp = new ApparatusList(listId, studentRegNo, issuedDate, status, receivedDate, adminsAdminId);
                apparatusList.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatusList;
    }

    public static final List<ListItems> getAllListItems(String id) throws SQLException {

        List<ListItems> listItems = new ArrayList<>();

        String query = "SELECT List_list_id,Apparatus_apparatus_id,qty,received,received_date,Admins_admin_id FROM List_Has_Apparatus WHERE List_list_id = '" + id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int listId = rset.getInt("List_list_id");
                int apparatusId = rset.getInt("Apparatus_apparatus_id");
                int qty = rset.getInt("qty");
                int status = rset.getInt("received");
                String receivedDate = rset.getString("received_date");
                int adminsAdminId = rset.getInt("Admins_admin_id");

                ListItems temp = new ListItems(listId, apparatusId, qty, status, receivedDate, adminsAdminId);
                listItems.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return listItems;
    }

    public static final void setListAsCompleted(int id, String date, int admin) {
        try {
            String query = "UPDATE List SET received = '1', received_date = '" + date + "', Admins_admin_id = '" + admin + "' WHERE list_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final void setListItemAsCompleted(int listId, int cID, String date, int admin) {
        try {
            String query = "UPDATE List_Has_Apparatus SET received = '1', received_date = '" + date + "', Admins_admin_id = '" + admin + "' WHERE List_list_id = '" + listId + "' AND Apparatus_apparatus_id = '" + cID + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final void addBrokenListItems(int listId, int apparatusId, int qty) {
        try {
            String query = "INSERT INTO Replacements (List_list_id,Apparatus_apparatus_id,qty) VALUES ("
                    + "'" + listId + "',"
                    + "'" + apparatusId + "',"
                    + "'" + qty + "'"
                    + ")";

            c.setQuery(query, "");
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final List<Replacements> getAllReplacements() throws SQLException {

        List<Replacements> replacements = new ArrayList<>();

        String query = "SELECT List_list_id,Apparatus_apparatus_id,qty FROM Replacements";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int listId = rset.getInt("List_list_id");
                int apparatusId = rset.getInt("Apparatus_apparatus_id");
                int qty = rset.getInt("qty");

                Replacements temp = new Replacements(listId, apparatusId, qty);
                replacements.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return replacements;
    }

    public static final void replaceBrokenComponent(int listId, int cID) {
        try {
            String query = "DELETE FROM Replacements WHERE List_list_id = '" + listId + "' AND Apparatus_apparatus_id = '" + cID + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
}
