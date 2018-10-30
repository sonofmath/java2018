/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.db_hw;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jrmathson
 */
public class App {
    public static String DEFAULT_DB = "jrs.db";
    public static String DEFAULT_URL = "jdbc:sqlite:" + DEFAULT_DB;
    String testname;
    Double testprice;
    int testquantity;

    public final String url;
    App() { this(DEFAULT_URL); }
    App(String url) { this.url = url; }

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Successfully connected to "+ DEFAULT_DB);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    // CREATE
    public void createNewDatabase() {

        try (Connection conn = connect()) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // More CREATE
    public void createNewTable() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS cart (\n"
                + "     name text PRIMARY KEY,\n"
                + "	price real NOT NULL,\n"
                + "	quantity integer\n"
                + ");";

        try (Connection conn = connect();
                Statement stmt = conn.createStatement()) {
            // create a new table
            System.out.println("Created new table");
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // More CREATE
    public void insert(String name, double price, int quantity) {
        String sql = "INSERT INTO cart (name, price, quantity) VALUES(?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, quantity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // READ
    public void selectAll(){
        String sql = "SELECT name, price, quantity FROM cart";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("name") +  "\t" + 
                                   rs.getDouble("price") + "\t" +
                                   rs.getInt("quantity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selectItem(String item) {
        String sql = "SELECT name, price, quantity FROM cart WHERE name = '" + item + "'";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            testname = rs.getString("name");
            testprice = rs.getDouble("price");
            testquantity = rs.getInt("quantity");
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("name") +  "\t" + 
                                   rs.getDouble("price") + "\t" +
                                   rs.getInt("quantity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // UPDATE
    public void updateItemQuantity(String name, int quantity) {
        String sql = "UPDATE cart SET quantity = ? WHERE name = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, quantity);
            pstmt.setString(2, name);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // DELETE
    public void delete(String name) {
        String sql = "DELETE FROM cart WHERE name = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, name);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new App().run();
    }

    void run() {
        //createNewDatabase();
        //createNewTable();
        connect();
        //insert("avocados", .89, 4);
        //insert("pickles", 2.25, 1);
        //selectItem("avocados");
        updateItemQuantity("grapes", 2);
        selectAll();
    }
}
