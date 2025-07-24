package jdbcLearn;

import java.sql.*;
import java.io.File;

public class JDBCDemo {
    public static void main(String[] args) {
        // Database URL - creates the database in the project root directory
        String dbURL = "jdbc:sqlite:mydatabase.db";
        
        try {
            // Connect to database (will create it if it doesn't exist)
            Connection conn = DriverManager.getConnection(dbURL);
            System.out.println("Connected to SQLite database");
            
            // Create a table
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                         "name TEXT, " +
                         "email TEXT, " +
                         "age INTEGER)";
            stmt.execute(sql);
            System.out.println("Table created");
            
            // Insert data
            sql = "INSERT INTO users (name, email, age) VALUES ('John Doe', 'john@example.com', 30)";
            stmt.execute(sql);
            System.out.println("Data inserted");
            
            // Query data
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            System.out.println("\nUsers in database:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + 
                                 rs.getString("name") + "\t" + 
                                 rs.getString("email") + "\t" + 
                                 rs.getInt("age"));
            }
            
            // Close resources
            rs.close();
            stmt.close();
            conn.close();
            
            System.out.println("\nDatabase file location: " + new File("mydatabase.db").getAbsolutePath());
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
