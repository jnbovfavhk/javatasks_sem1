package org.knit.jnbovfavhk.sem1.lab11.Task24Classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:sqlite:C:\\Users\\belonozhkoin\\IdeaProjects\\javatasks\\newDb";

    private static Connection connection;

    private DataBaseConnection() {}

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL);
        }
        return connection;
    }
}
