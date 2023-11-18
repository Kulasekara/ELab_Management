/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.database;

import com.rad.demo.database.utils.Connect;
import com.rad.demo.entities.LogIn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHARATHA
 */
public class LogInSQL {

    private static final Connect c = new Connect();

    public static LogIn getLogIn(String uname, String password) throws SQLException {

        LogIn li = null;

        String query = "SELECT admin_id,title,name,role,uname,password FROM Admins WHERE uname = '" + uname + "' AND BINARY password = '" + password + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                int adminId = rset.getInt("admin_id");
                String title = rset.getString("title");
                String name = rset.getString("name");
                String role = rset.getString("role");
                String uName = rset.getString("uname");
                String pw = rset.getString("password");

                li = new LogIn(adminId, title, name, role, uName, pw);
            } else {
                li = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return li;
    }

    public static void setLastLoggedIn(String uname, String date) {
        try {
            String query = "UPDATE Admins SET last_logged_in = '" + date + "', logged_in = '1' WHERE Admins.uname = '" + uname + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }

    public static LogIn chk() throws SQLException {
        LogIn li = null;

        String query = "SELECT admin_id,title,name,role,uname,password FROM Admins WHERE logged_in != '0'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                int adminId = rset.getInt("admin_id");
                String title = rset.getString("title");
                String name = rset.getString("name");
                String role = rset.getString("role");
                String uName = rset.getString("uname");
                String pw = rset.getString("password");

                li = new LogIn(adminId, title, name, role, uName, pw);
            } else {
                li = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return li;
    }
}
