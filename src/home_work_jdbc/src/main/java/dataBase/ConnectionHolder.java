package home_work_JDBC.dataBase;


import java.sql.*;

public class ConnectionHolder {

    public static Connection connection;
    public static Statement statement;

    private String url = "jdbc:mysql://localhost:3306/film_library?useSSL=false";
    private String user = "root";
    private String pass = "root";

    public void connection() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConection() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
