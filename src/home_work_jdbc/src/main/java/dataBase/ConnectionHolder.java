package home_work_JDBC.dataBase;


import java.sql.*;

public class ConnectionHolder {

    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement preparedStatement;

    private String url = "jdbc:mysql://localhost:3306/film_library";
    private String user = "root";
    private String pass = "root";

    public Connection createConnection() {
        Connection mycon = null;
        try {
            mycon = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mycon;
    }

    public void closeConnection() {
        try {
            statement.close();
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
