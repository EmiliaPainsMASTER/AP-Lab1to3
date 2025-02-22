package Lab3Part4;

import java.sql.*;

/**
 * This program creates, inserts, reads and deletes data from a table using Java Database Controller
 * @Author EmiliaPains
 * @Version 1.0
 */
public class Lab3Part4 {
    /**
     * Main method which creates the three variables of urlDB, usernameDB and passwordDB then calls on the method of createConnectionToDB to start the CRUD
     * @param args for command line arguments
     */
    public static void main(String[] args) {
        String urlDB = "jdbc:mysql://localhost:3306/JDBC";
        String usernameDB = "root";
        String passwordDB = "";
        createConnectionToDB(urlDB, usernameDB, passwordDB);
    }
    /**
     * Method to create a connection to the DB and then use four methods to create, insert, read and delete tables/ records
     * <p>
     * Uses a variable named connection which takes in the tree parameters to make the connection
     * <p>
     * Uses try-with-resources which will automatically close the connection resource when finished
     * @param urlDB this parameter is the url of the DB
     * @param usernameDB this parameter is the username of the DB in order to login
     * @param passwordDB this parameter is the password of the DB in order to login
     */
    private static void createConnectionToDB(String urlDB, String usernameDB, String passwordDB) {
        try (Connection connection = connectToDB(urlDB, usernameDB, passwordDB)) {
            System.out.println("Database created");

            createTable(connection);
            insertSongIntoDatabase(connection);
            readSongsFromDatabase(connection);
            deleteSongFromDatabase(connection);
            readSongsFromDatabase(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Creates a table named favouriteSongs with the attributes of id and songName,
     * <p>
     * id is an integer primary key
     * <p>
     * songName is a variable character with a max length of 50
     * <p>
     * Once the query is executed the method will print out "Table created: favouriteSongs"
     * @param connection This parameter uses variable connection to use the statements in order to execute the query
     * @throws SQLException if there is a fault with the SQL query an SQLException will be thrown
     */
    private static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "CREATE TABLE favouriteSongs (id INT PRIMARY KEY, songName VARCHAR(50))";
        statement.executeUpdate(query);
        System.out.println("Table created: favouriteSongs");
    }
    /**
     * Inserts two records into the table
     * <p>
     * Once the query is executed the method will print out "Two records inserted"
     * @param connection This parameter uses variable connection to use the statements in order to execute the query
     * @throws SQLException if there is a fault with the SQL query an SQLException will be thrown
     */
    private static void insertSongIntoDatabase(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "INSERT INTO favouriteSongs (id, songName) VALUES (1,'Du Hast'),(2,'Sandman')";
        statement.executeUpdate(query);
        System.out.println("Two records inserted");
    }
    /**
     * Reads all contents from favourite songs
     * <p>
     * ResultSet according to Java is a pointer to the current row, similiar to how bufferedReader works in that it reads line by line
     * <p>
     * Once the query is executed the method will print out the id of the record alongside the song name
     * @param connection This parameter uses variable connection to use the statements in order to execute the query
     * @throws SQLException if there is a fault with the SQL query an SQLException will be thrown
     */
    private static void readSongsFromDatabase(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM favouriteSongs";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getString("songName"));
        }
    }
    /**
     * Deletes a record from the table
     * <p>
     * Once the query is executed the method will print out "Song deleted"
     * @param connection This parameter uses variable connection to use the statements in order to execute the query
     * @throws SQLException if there is a fault with the SQL query an SQLException will be thrown
     */
    private static void deleteSongFromDatabase(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "DELETE FROM favouriteSongs WHERE id = 1";
        statement.executeUpdate(query);
        System.out.println("Song deleted");
    }
    /**
     * Method to connect to the DB
     * @param url this parameter is the url of the DB
     * @param user this parameter is the username of the DB in order to login
     * @param password this parameter is the password of the DB in order to login
     * @return returns the connection using the driver manager
     * @throws SQLException if there is a fault with the url, user, password or driver SQLException will be thrown
     */
    private static Connection connectToDB(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
