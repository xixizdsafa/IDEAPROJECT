package connect;

import java.sql.*;

/**
 * Created by jay chen on 2016/8/28.
 */
public class DBconnect {
    public static Connection getConn(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","00000000");
                if (connection == null) {
                    System.out.println(1);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConn (Connection connection, Statement statement){
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
            if (!statement.isClosed()) {
                statement.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void closeConn (Connection connection, Statement statement, ResultSet resultSets){
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
            if (!statement.isClosed()) {
                statement.close();
            }
            if(!resultSets.isClosed()){
                resultSets.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
