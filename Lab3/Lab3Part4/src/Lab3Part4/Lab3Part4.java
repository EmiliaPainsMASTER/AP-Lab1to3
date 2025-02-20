package Lab3Part4;

import java.sql.*;

public class Lab3Part4 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306");) {
            // Create a SQL statement
            Statement stmt = connection.createStatement();
            // Example SQL query (modify as needed)
            String query = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(50))";
            // Execute SQL query
            stmt.executeUpdate(query);
            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection connectToDB(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
