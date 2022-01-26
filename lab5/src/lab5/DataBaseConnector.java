package lab5;

import java.sql.*;

public class DataBaseConnector {
    private Connection connection;

    public DataBaseConnector() {
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:mem:test", "user", "");
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (InstantiationException exception) {
            exception.printStackTrace();
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public void executeSQL(String queue) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(queue);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public ResultSet executeSQLWithResult(String queue) {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(queue);
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}