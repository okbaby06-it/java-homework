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
        String dbName = "UniversityDB";

        //jdbc db url
        String jdbcURL = "jdbc:mysql://" + serverName + ":" + port + "/" + dbName;

        try{
            //nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //tao ket noi database
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Ket noi thanh cong voi database: " + serverName);

            //- Thực hiện câu lệnh SQL để lấy tất cả các cột id, name, và age từ bảng students.
            //- Hiển thị kết quả truy vấn ra màn hình.

            //tao statement
            Statement stmt = conn.createStatement();

            ResultSet resuslt = stmt.executeQuery("select * from students");

            while(resuslt.next()){
                int id = resuslt.getInt("id");
                String name = resuslt.getNString("name");
                int age = resuslt.getInt("age");

                System.out.println(id + " | " + name + " | " + age);
            }
        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay MySql Driver");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}