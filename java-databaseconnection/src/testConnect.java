import java.sql.*;
public class testConnect {
    public static void main(String[] args) {
        //info database
        String serverName = "localhost";
        int port = 3306;
        String userName = "root";
        String password = "257206";
        String dbName = "sinhvien";

        String jdbcURL = "jdbc:mysql://" + serverName + ":"+ port + "/" + dbName;
        try{
            //nạp driver (Bắt buộc phải để trong try)
            Class.forName("com.mysql.cj.jdbc.Driver"); //com.mysql.cj.jdbc.Driver

            //tao ket noi
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connect success");

            conn.close();
        }catch (ClassNotFoundException e) {
            System.out.println(" Lỗi: Không tìm thấy MySQL Driver!");
        } catch (SQLException e) {
            System.out.println(" Lỗi kết nối: " + e.getMessage());
        }
    }
}
