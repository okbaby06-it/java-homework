package util;

import java.sql.*;

public class DatabaseConnection {
    //information database
    private static final String jdbcURl = "jdbc:mysql://localhost:3306/sinhvien";
    private static final String userName = "root";
    private static final String password = "257206";

    //check connection
    private static Connection connection = null;

    //connect database
    public static Connection getConnection(){
        try{
            if(connection == null || connection.isClosed()){
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURl, userName, password);
            }
        }catch (ClassNotFoundException e){
            System.out.println("Loi! Khong Tim Thay Driver MySQL");
        }catch (SQLException e){
            System.out.println("Loi Ket Noi: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }

        return connection;
    }

    //close connection
    public static void closeConnection(){
        try {
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println("Loi: " + e.getMessage());
        }
    }

    //check connection
    public static boolean isConnection(){
        try{
            if(connection != null && !connection.isClosed()){
                return true;
            }
        }catch (SQLException e){
            System.out.println("Loi: " + e.getMessage());
        }

        return false;
    }
}
