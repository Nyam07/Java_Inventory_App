
package inventory_app;
import java.sql.*;

public class Inventory_app {
    public static Connection connection;
    

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/inventory_app";
        String username = "root";
        String password = "37322929";
        
         try {
            // Connect to the database
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
        
        
    }
    
}
