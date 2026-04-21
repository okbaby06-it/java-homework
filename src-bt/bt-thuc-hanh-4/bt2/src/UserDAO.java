import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO implements IUserDAO {
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
            if (resultPStmt > 0) return true;
        } catch (ClassNotFoundException e) {
            System.out.println("Loi Khong Tim Thay Driver MySQL");
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }

        return false;
    }

    @Override
    public User findUserName(String userName) {
        User user = null; // khởi tạo user = null

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(jdbcURL, this.userName, password);

            //prepare sql Query
            String prepareSQLQuery = "select * from user where username = ?";

            PreparedStatement pStmt = conn.prepareStatement(prepareSQLQuery);
            pStmt.setString(1, userName);

            ResultSet resultSet = pStmt.executeQuery();
            //nếu tìm thấy
            if (resultSet.next()) {
                user = new User();

                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
            }
            resultSet.close();
            pStmt.close();
            resultSet.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Loi Khong Tim Thay Driver MySQL");
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }
        return user;
    }

    @Override
    public boolean updateUserEmail(int id, String email) {
        try {
            //nạp driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //prepare sql Query
            String prepareSQLQuery = "update user set email = ? where id = ?";

            PreparedStatement pStmt = conn.prepareStatement(prepareSQLQuery);
            pStmt.setString(1, email);
            pStmt.setInt(2, id);

            int resultPStmt = pStmt.executeUpdate();

            conn.close();
            pStmt.close();

            return resultPStmt > 0; // return true

        } catch (ClassNotFoundException e) {
            System.out.println("Loi Khong Tim Thay Driver MySQL");
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }

        return false;
    }

}