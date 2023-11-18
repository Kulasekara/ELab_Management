/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.database;

import com.rad.demo.database.utils.Connect;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHARATHA
 */
public class DashBoardSQL {

    private static final Connect c = new Connect();

    public static void setLoggedIn(String uName) {
        try {
            String query = "UPDATE Admins SET logged_in = '0' WHERE Admins.uname = '" + uName + "'";
            c.setQuery(query);
            c.Conn().close();
            System.out.println("Connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.gc();
    }
}
