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
        String dbName = "CompanyDB";

        //url
        String jdbcURL = "jdbc:mysql://" + serverName + ":" + port + "/" + dbName;

        try{
            //nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //tao ket noi
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //stmt
            Statement stmt = conn.createStatement();

            String prepareSQLQuery = "select * from employees where salary > 5000";

            //queryData
            ResultSet resultSet = stmt.executeQuery(prepareSQLQuery);

            System.out.println("Nhan vien co muc luong > 5000");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                String department = resultSet.getNString("department");
                double salary = resultSet.getDouble("salary");

                System.out.println(id + " - " + name + " - " + department + " - " + salary);
            }


        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay Dirver MySQL");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }

    }
}