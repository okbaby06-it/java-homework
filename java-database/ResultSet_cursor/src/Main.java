import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sinhvien";
        String userName = "root";
        String password = "257206";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //ResultSet.TYPE_FORWARD_ONLY -> (Loại con trỏ) duyệt xuôi từ đầu đến cuối -> chỉ gọi được next()
            //ResultSet.CONCUR_READ_ONLY -> (Chế độ) -> chỉ đọc (Không thể cập nhật / chèn / sửa / xóa)
            Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

            ResultSet resultSet = stmt.executeQuery("select * from sinhvien");

            while(resultSet.next()){
                System.out.println(
                        "id: " + resultSet.getString("masv") + " " +
                        "Name: " + resultSet.getString("hoten") + " " +
                        "NgaySinh: " + resultSet.getString("ngaysinh") + " " +
                        "Gioi Tinh: " + resultSet.getString("gioitinh") + " " +
                        "Dia Chi: " + resultSet.getString("diachi") + " " +
                        "Ma Lop: " + resultSet.getString("malop") + " " +
                        "Password: " + resultSet.getString("password")
                );
            }


        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay Driver MySQL");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}