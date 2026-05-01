import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        //info database
        String serverName = "localhost";
        int port = 3306;
        String userName = "root";
        String password = "257206";
        String dbName = "sinhvien";

        String jdbcURL = "jdbc:mysql://" + serverName + ":" + port + "/" + dbName;

        try{
            //nạp driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection database
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //create statement
            Statement stmt = conn.createStatement();

            String prepareSQL = "select * from sinhvien";

            ResultSet resultSet = stmt.executeQuery(prepareSQL);

            while (resultSet.next()){
                String maSV = resultSet.getNString("masv");
                String hoTen = resultSet.getNString("hoten");
                String ngaySinh = resultSet.getDate("ngaysinh").toString();
                String gioiTinh = resultSet.getNString("gioitinh");
                String diaChi = resultSet.getNString("diachi");
                String maLop = resultSet.getNString("malop");

                System.out.println(maSV + " - " + hoTen + " - " + ngaySinh + " - " + gioiTinh + " - " + diaChi + " - " + maLop);
            }



        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay Driver MySQL");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}