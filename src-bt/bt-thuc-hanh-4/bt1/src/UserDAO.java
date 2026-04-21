import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO implements IUserDAO{
    //info database
    String serverName = "localhost";
    int port = 3306;
    String userName = "root";
    String password = "257206";
    String dbName = "ql_user";

    //jdbcURL
    String jdbcURL = "jdbc:mysql://" + serverName + ":" + port + "/" + dbName;

    @Override
    public boolean addUser(User user) {
        //connect database (nên connect function)
        try {
            //nạp driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            //connection
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //prepare sql Query
            String prepareSQLQuery = "insert into user(username, password, email) value(?, ?, ?)";

            //use prepareStatement
            //gán giá trị cho các ?
            PreparedStatement pStmt = conn.prepareStatement(prepareSQLQuery);
            pStmt.setString(1, user.getUserName());
            pStmt.setString(2, user.getPassword());
            pStmt.setString(3, user.getEmail());

            //executeUpdate() thực thi câu lệnh sql
            int resultPStmt = pStmt.executeUpdate(); //trả về số dòng bị ảnh hưởng

            pStmt.close();
            conn.close();

            if(resultPStmt > 0) return true;
        }catch (ClassNotFoundException e){
            System.out.println("Loi Khong Tim Thay Driver MySQL");
        }catch (Exception e){
            System.out.println("Loi" + e.getMessage());
        }

        return false;
    }
}
