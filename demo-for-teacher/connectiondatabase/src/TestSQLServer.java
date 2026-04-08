
import java.sql.Connection;
import java.sql.DriverManager;

public class TestSQLServer {

    public static void main(String[] args) {

        String url
                = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=qlbh;"
                + "integratedSecurity=true;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";

        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Kết nối thành công!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
