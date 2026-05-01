import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

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
            //nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connect database
            Connection conn = DriverManager.getConnection(jdbcURL, userName, password);

            //create statement
            Statement stmt = conn.createStatement();

            Scanner scn = new Scanner(System.in);
            System.out.print("MaSV: ");
            String maSV = scn.nextLine().trim();
            System.out.print("Ho Ten: ");
            String fullName = scn.nextLine().trim();
            System.out.print("Ngay Sinh: ");
            String date = scn.nextLine().trim();
            LocalDate dateCompare = LocalDate.parse(date);
            System.out.print("Gioi Tinh: ");
            String sex = scn.nextLine().trim();
            System.out.print("Dia Chi: ");
            String address = scn.nextLine().trim();
            System.out.print("Ma Lop: ");
            String maLop = scn.nextLine().trim();
            System.out.print("Password: ");
            String passwordSV = scn.nextLine().trim();

            String sqlPrepare = "INSERT INTO sinhvien VALUES ('"
                    + maSV + "', '"
                    + fullName + "', '"
                    + dateCompare + "', '"
                    + sex + "', '"
                    + address + "', '"
                    + maLop + "', '"
                    + passwordSV + "')";

            stmt.executeUpdate(sqlPrepare);
            System.out.println("Insert sinh vien thanh cong");


        }catch (ClassNotFoundException e){
            System.out.println("Khong tim thay driver MySQL");
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}