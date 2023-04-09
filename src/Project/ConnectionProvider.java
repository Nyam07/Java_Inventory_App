/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class ConnectionProvider {
    public static Connection getCon(){
        
        String url = "jdbc:mysql://localhost:3306/inventory_app";
        String username = "root";
        String password = "37322929";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        }
        catch(Exception e){
             System.err.println("Error connecting to the database: " + e.getMessage());
             return null;
        }
    }
}
