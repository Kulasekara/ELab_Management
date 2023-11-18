/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.database;

import com.rad.demo.database.utils.Connect;
import com.rad.demo.entities.Admins;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHARATHA
 */
public class AdminsSQL {

    private static final Connect c = new Connect();

    public static String getAdminName(int id) throws SQLException {

        String name = null;

        String query = "SELECT title,name FROM Admins WHERE admin_id = '" + id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                name = rset.getString("title") + " " + rset.getString("name");
            } else {
                name = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return name;
    }
    
    public static int getIdByName(String name) throws SQLException {

        int id = 0;

        String query = "SELECT admin_id FROM Admins WHERE name = '" + name + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                id = rset.getInt("admin_id");
            } else {
                id = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return id;
    }

    public static int getAvailable(int id) throws SQLException {

        int avl = 0;

        String query = "SELECT Available FROM Admins WHERE admin_id = '" + id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                avl = rset.getInt("Available");
            } else {
                avl = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return avl;
    }

    public static String getPassword(int id) throws SQLException {

        String pw = null;

        String query = "SELECT Password FROM Admins WHERE admin_id = '" + id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                pw = rset.getString("password");
            } else {
                pw=null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return pw;
    }
    
    public static int getIdByUname(String uname) throws SQLException {

        int id = 0;

        String query = "SELECT admin_id FROM Admins WHERE uname = '" + uname + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                id = rset.getInt("admin_id");
            } else {
                id=0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return id;
    }

    public static int getAvailableByuname(String uname) throws SQLException {

        int avl = 0;

        String query = "SELECT Available FROM Admins WHERE uname = '" + uname + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                avl = rset.getInt("Available");
            } else {
               avl = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return avl;
    }

    public static final List<Admins> getAdminsDetails() throws SQLException {

        List<Admins> admins = new ArrayList<>();

        String query = "SELECT admin_id,title,name,role,Available FROM admins";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                int adminId = rset.getInt("admin_id");
                String title = rset.getString("title");
                String name = rset.getString("name");
                String role = rset.getString("role");
                int available=rset.getInt("Available");

                Admins temp = new Admins(adminId,title,name,role,available);
                admins.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return admins;
    }
    
    public static final void deleteDetails(int admin_id) {
        try {
            String query = "DELETE FROM Admins WHERE admin_id = '" + admin_id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(ListSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    public static final void addNewAdmin(int id,String title, String role, String nic, int phone,String email, String uname,String password){
        try {
            String query = "INSERT INTO Admins (admin_id,title,name,role,nic,phone,email,uname,password) VALUES ("
                    + "'" + id + "',"
                    + "'" + title + "',"
                    + "'" + role+ "',"
                    + "'" + nic+ "',"
                    + "'" + phone+ "',"
                    + "'" + email+ "',"
                    + "'" + uname+ "',"
                    + "'" + password+ "'"
                    + ")";

            c.setQuery(query, "");
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    public static int getMaxId() throws SQLException {

        int maxId = 0;

        String query = "SELECT admin_id FROM admins ORDER BY admin_id DESC LIMIT 1";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
               maxId = rset.getInt("admin_id");
            } else {
                maxId = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return maxId;
    }
    
    public static final Admins getTitle(int admin_id) throws SQLException {

        Admins admin = null;

        String query = "SELECT title FROM Admins WHERE admin_id = '" + admin_id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        
            if (rset.next()) {
                
                String title = rset.getString("title");

                admin = new Admins(title);
            } 
            rset.close();
        
        System.gc();
        return admin;
    }
    
    public static final List<Admins> getAdminsDetailsById(int id) throws SQLException {

        List<Admins> admins = new ArrayList<>();

        String query = "SELECT title,name,role,nic,phone,email FROM admins WHERE admin_id = '" + id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

       
            while (rset.next()) {
                String title = rset.getString("title");
                String name = rset.getString("name");
                String role = rset.getString("role");
                String nic = rset.getString("nic");
                String phone = rset.getString("phone");
                String email = rset.getString("email");

                Admins temp = new Admins(title,name,role,nic,phone,email);
                admins.add(temp);
            }
        
            rset.close();
        
        System.gc();
        return admins;
    }
    
    public static final void setRole(int id, String role) {
        
        try {
            String query = "UPDATE Admins SET role = '" + role + "' WHERE admin_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    public static final void setPassword(String pw,int id) {
        
        try {
            String query = "UPDATE Admins SET password = '" + pw + "' WHERE admin_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final void setUname(String uname,int id) {
        
        try {
            String query = "UPDATE Admins SET uname = '" + uname + "' WHERE admin_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static final void setAdmin(int id,String name,String nic,String phone,String mail) {
        
        try {
            String query = "UPDATE Admins SET "
                    + "name = '" + name + "',"
                    + "nic = '" + nic + "',"
                    + "phone = '" + phone + "',"
                    + "email = '" + mail + "'"
                    + "WHERE admin_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    public static final void setAvailable(int id, int avl) {
        
        try {
            String query = "UPDATE Admins SET Available = '" + avl + "' WHERE admin_id = '" + id + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
    
    public static final void addNewAdmin(int id,String title, String name, String role,String nic,String phone,String mail,String uname,String password,String last_logged,int logged,int avl){
        try {
            String query = "INSERT INTO Admins (admin_id,title,name,role,nic,phone,email,uname,password,last_logged_in,logged_in,Available) VALUES ("
                    + "'" + id + "',"
                    + "'" + title + "',"
                    + "'" + name+ "',"
                    + "'" + role+ "',"
                    + "'" + nic+ "',"
                    + "'" + phone+ "',"
                    + "'" + mail+ "',"
                    + "'" + uname+ "',"
                    + "'" + password+ "',"
                    + "'" + last_logged+ "',"
                    + "'" + logged+ "',"
                    + "'" + avl+ "'"
                    + ")";

            c.setQuery(query, "");
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(AdminsSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    
}
