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

        //jdbc url
        String jdbcURL = "jdbc:mysql://" + serverName + ":" + port + "/" + dbName;

        try {
            //nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //create statement
            Statement stmt = conn.createStatement();

            String prepareQuerySQL =
                    "select s.id as student_id, s.name as student_name, crs.name as courses_name, st.grade " +
                    "from students s " +
                    "join student_courses st on s.id = st.student_id " +
                    "join courses crs on st.course_id = crs.id " +
                    "where st.grade > 80 " +
                    "order by s.name asc ";

            //query data
            ResultSet resultSet = stmt.executeQuery(prepareQuerySQL);

            while(resultSet.next()){
                int id = resultSet.getInt("student_id");
                String nameStudent = resultSet.getNString("student_name");
                String nameCourses = resultSet.getNString("courses_name");
                double grade = resultSet.getDouble("grade");

                System.out.println(id + " - " + nameStudent + " - " + nameCourses + " - " + grade);
            }
        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay Driver MySQL");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}