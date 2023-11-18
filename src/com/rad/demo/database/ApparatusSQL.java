/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rad.demo.database;

import com.rad.demo.database.utils.Connect;
import com.rad.demo.entities.Apparatus;
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
public class ApparatusSQL {

    private static final Connect c = new Connect();

    public static List<String> getGroups() throws SQLException {

        List<String> groups = new ArrayList<>();

        String query = "SELECT DISTINCT groupz FROM Apparatus WHERE qty > 0 ORDER BY groupz";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                groups.add(rset.getString("groupz"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return groups;
    }

    public static final List<Object> getAllFamilies() throws SQLException {

        List<Object> families = new ArrayList<>();

        String query = "SELECT DISTINCT family FROM Apparatus WHERE qty > 0 ORDER BY family";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            families.add("<All families>");
            while (rset.next()) {
                families.add(rset.getString("family"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return families;
    }

    public static final List<Object> getFamilies(String group) throws SQLException {

        List<Object> families = new ArrayList<>();

        String query = "SELECT DISTINCT family FROM Apparatus WHERE groupz = '" + group + "' AND qty > 0 ORDER BY family";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            families.add("<All families>");
            while (rset.next()) {
                families.add(rset.getString("family"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return families;
    }

    public static final List<Apparatus> getAllComponents() throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> getComponentsByGroup(String group1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE groupz = '" + group1 + "' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> getComponentsByFamily(String family1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE family = '" + family1 + "' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> getComponents(String group1, String family1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE groupz = '" + group1 + "' AND family = '" + family1 + "' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> searchAllComponents(String component1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE component LIKE '" + component1 + "%' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> searchComponentsByGroup(String group1, String component1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE groupz = '" + group1 + "' AND component LIKE '" + component1 + "%' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> searchComponentsByFamily(String family1, String component1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE family = '" + family1 + "' AND component LIKE '" + component1 + "%' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final List<Apparatus> searchComponents(String group1, String family1, String component1) throws SQLException {

        List<Apparatus> apparatus = new ArrayList<>();

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE groupz = '" + group1 + "' AND family = '" + family1 + "' AND component LIKE '" + component1 + "%' AND qty > 0 ORDER BY component";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            while (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                Apparatus temp = new Apparatus(group, family, component, qty);
                apparatus.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final Apparatus searchByComponent(String component1) throws SQLException {

        Apparatus apparatus = null;

        String query = "SELECT groupz,family,component,qty FROM Apparatus WHERE component = '" + component1 + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");
                int qty = rset.getInt("qty");

                apparatus = new Apparatus(group, family, component, qty);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

    public static final Apparatus getComponentDetails(String component1) throws SQLException {

        Apparatus apparatus = null;

        String query = "SELECT apparatus_id,qty FROM Apparatus WHERE component = '" + component1 + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                int id = rset.getInt("apparatus_id");
                int qty = rset.getInt("qty");

                apparatus = new Apparatus(id, qty);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }
    
    
    public static final Apparatus searchById(String id) throws SQLException {

        Apparatus apparatus = null;

        String query = "SELECT groupz,family,component FROM Apparatus WHERE apparatus_id = '" + id + "'";

        ResultSet rset = c.getQuery(query);
        c.Conn().close();
        System.out.println("Connection closed");

        try {
            if (rset.next()) {
                String group = rset.getString("groupz");
                String family = rset.getString("family");
                String component = rset.getString("component");

                apparatus = new Apparatus(group, family, component);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogInSQL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rset.close();
        }
        System.gc();
        return apparatus;
    }

}
