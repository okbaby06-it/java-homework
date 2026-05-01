import java.sql.*;

public class update_with_resultset {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sinhvien";
        String userName = "root";
        String password = "257206";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //ResultSet.TYPE_SCROLL_INSENSITIVE (loại con trỏ) -> cho di chuyển 2 chiều trong resultset với các phương thức
            //ResultSet.CONCUR_READ_ONLY (chế độ) --> chỉ đọc dữ liệu

            //ResultSet.TYPE_SCROLL_SENSITIVE (loại con trỏ) -> thấy được sự thay đổi dữ liệu thời gian thực
            //ResultSet.CONCUR_UPDATABLE (chế độ) -> cho update dữ liệu từ resultset
                    //updateXxx() - cập nhật giá trị cột
                    //updateRow() - lưu thay đổi xuống DB
                    //deleteRow() - xóa dòng hiện tại
                    //insertRow() - thêm dòng mới
                    //moveToInsertRow() - di chuyển đến vùng chèn

            Statement stmt = conn.createStatement(
                    //ResultSet.TYPE_SCROLL_INSENSITIVE,
                    //ResultSet.CONCUR_READ_ONLY
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );

            String prepareSQL = "select * from sinhvien";

            ResultSet resultSet = stmt.executeQuery(prepareSQL);

            resultSet.last();

            System.out.println("Dữ liệu trước khi update");
            System.out.println(
                "id: " + resultSet.getString("masv") + " " +
                "Name: " + resultSet.getString("hoten") + " " +
                "NgaySinh: " + resultSet.getString("ngaysinh") + " " +
                "Gioi Tinh: " + resultSet.getString("gioitinh") + " " +
                "Dia Chi: " + resultSet.getString("diachi") + " " +
                "Ma Lop: " + resultSet.getString("malop") + " " +
                "Password: " + resultSet.getString("password")
            );

            //update dữ liệu
            resultSet.updateString("hoten", "Dương Thanh Vinh Dương Thanh Vinh");
            resultSet.updateString("diachi", "Đồng Tháp Đồng Tháp");

            resultSet.updateRow(); // lưu thay đổi update
            resultSet.refreshRow(); // refresh lại dòng hiện tại

            System.out.println("Dữ liệu sau khi update");
            System.out.println(
                "id: " + resultSet.getString("masv") + " " +
                "Name: " + resultSet.getString("hoten") + " " +
                "NgaySinh: " + resultSet.getString("ngaysinh") + " " +
                "Gioi Tinh: " + resultSet.getString("gioitinh") + " " +
                "Dia Chi: " + resultSet.getString("diachi") + " " +
                "Ma Lop: " + resultSet.getString("malop") + " " +
                "Password: " + resultSet.getString("password")
            );

        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay driver MySQL");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
