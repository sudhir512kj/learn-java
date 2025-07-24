package jdbcLearn;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String dbURL = "jdbc:sqlite:mydatabase.db";
        
        try (Connection conn = DriverManager.getConnection(dbURL)) {
            System.out.println("Connected to SQLite database");
            
            // Create table if not exists
            createTable(conn);
            
            // Insert multiple users using prepared statement
            insertUsers(conn);
            
            // Query users by age using prepared statement
            queryUsersByAge(conn, 25);
            
            // Update user email using prepared statement
            updateUserEmail(conn, 1, "john.updated@example.com");
            
            // Delete user using prepared statement
            deleteUser(conn, 3);
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
    
    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "name TEXT, " +
                     "email TEXT, " +
                     "age INTEGER)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.execute();
            System.out.println("Table created/verified");
        }
    }
    
    private static void insertUsers(Connection conn) throws SQLException {
        String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // Insert first user
            pstmt.setString(1, "Alice Smith");
            pstmt.setString(2, "alice@example.com");
            pstmt.setInt(3, 28);
            pstmt.executeUpdate();
            
            // Insert second user
            pstmt.setString(1, "Bob Johnson");
            pstmt.setString(2, "bob@example.com");
            pstmt.setInt(3, 32);
            pstmt.executeUpdate();
            
            // Insert third user
            pstmt.setString(1, "Carol Davis");
            pstmt.setString(2, "carol@example.com");
            pstmt.setInt(3, 24);
            pstmt.executeUpdate();
            
            System.out.println("Users inserted successfully");
        }
    }
    
    private static void queryUsersByAge(Connection conn, int minAge) throws SQLException {
        String sql = "SELECT * FROM users WHERE age >= ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, minAge);
            ResultSet rs = pstmt.executeQuery();
            
            System.out.println("\nUsers with age >= " + minAge + ":");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + 
                                 rs.getString("name") + "\t" + 
                                 rs.getString("email") + "\t" + 
                                 rs.getInt("age"));
            }
        }
    }
    
    private static void updateUserEmail(Connection conn, int userId, String newEmail) throws SQLException {
        String sql = "UPDATE users SET email = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, userId);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("\nUpdated " + rowsAffected + " user(s)");
        }
    }
    
    private static void deleteUser(Connection conn, int userId) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Deleted " + rowsAffected + " user(s)");
        }
    }
}