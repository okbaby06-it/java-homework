package daoImpl;

import dao.ISinhVienDAO;
import model.SinhVien;
import util.DatabaseConnection;

import java.sql.*;

public class SinhVienImplDAO implements ISinhVienDAO {
    //từ SinhVienImplDAO có thể implement đến IGenericDAO thông qua ISinhVienDAO đã extends IGenericDAO (gọi là kế thừa bắc cầu)

    //CRUD
    @Override
    public void insert(SinhVien sinhVien) {
        //connect database
        Connection conn =  DatabaseConnection.getConnection();

        try {
            //Kiem tra sinh vien truoc khi Insert
//            Statement stmt = conn.createStatement();
//            ResultSet idSV = stmt.executeQuery("select masv from sinhvien");
//            while (idSV.next()){
//                String checkIDSV = idSV.getString("masv");
//                if(checkIDSV == sinhVien.getId()){
//                    throw new Exception("Sinh Vien Co Ma: " + sinhVien.getId() + " Da Ton Tai! Khong The Insert");
//                }
//            }

            String sqlCheck = "select exists (select * from sinhvien where masv = ?)"; //tra ve 1 dong du lieu true/ false
            PreparedStatement pStmtCheck = conn.prepareStatement(sqlCheck);
            pStmtCheck.setString(1, sinhVien.getId().trim().toUpperCase());
            ResultSet resultCheckSV = pStmtCheck.executeQuery();
            while(resultCheckSV.next() && resultCheckSV.getBoolean(1)){
                pStmtCheck.close();
                resultCheckSV.close();
                throw new Exception("Sinh Vien Co Ma: " + sinhVien.getId() + " Da Ton Tai! Khong The Insert");
            }

            //querySQL
            String insertSQL = "insert into sinhvien (masv, hoten, ngaysinh, gioitinh, diachi, malop, password) " +
                    "values (?, ?, ?, ?, ?, ?, ?)";

            //create prepareStatement
            PreparedStatement pStmt = conn.prepareStatement(insertSQL);
            pStmt.setNString(1, sinhVien.getId());
            pStmt.setNString(2, sinhVien.getName());
            pStmt.setDate(3, new java.sql.Date(sinhVien.getNgaySinh().getTime()));
            pStmt.setNString(4, sinhVien.getGioiTinh());
            pStmt.setNString(5, sinhVien.getDiaChi());
            pStmt.setNString(6, sinhVien.getMalop());
            pStmt.setNString(7, sinhVien.getPassword());

            int resultInsert = pStmt.executeUpdate();

            pStmt.close();

            if(resultInsert > 0){
                System.out.println("Da Insert Thanh Cong Sinh Vien Co Ma So: " + sinhVien.getId());
            }
        }catch (SQLException e){
            System.out.println("Loi Khi Insert: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }

    @Override
    public void update(SinhVien sinhVien) {
        //connect database
        Connection conn = DatabaseConnection.getConnection();

        //querySQL
        String updateSQL = "update sinhvien " +
                "set hoten = ?, " +
                "ngaysinh = ?, " +
                "gioitinh = ?, " +
                "diachi = ?, " +
                "malop = ?, " +
                "password = ? " +
                "where masv = ? ";

        try {
            PreparedStatement pStmt = conn.prepareStatement(updateSQL);
            pStmt.setNString(1, sinhVien.getName());
            pStmt.setDate(2, new java.sql.Date(sinhVien.getNgaySinh().getTime()));
            pStmt.setNString(3, sinhVien.getGioiTinh());
            pStmt.setNString(4, sinhVien.getDiaChi());
            pStmt.setNString(5, sinhVien.getMalop());
            pStmt.setNString(6, sinhVien.getPassword());
            pStmt.setNString(7, sinhVien.getId());

            int resultUpdate = pStmt.executeUpdate();

            pStmt.close();

            if(resultUpdate > 0){
                System.out.println("Da Update Thanh Cong Sinh Vien Co Ma So: " + sinhVien.getId());
            }

        }catch (SQLException e){
            System.out.println("Loi Update: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }

    @Override
    public void delete(String id) {

        id = id.trim().strip().toLowerCase();

        Connection conn = DatabaseConnection.getConnection();

        try{
            //kiem tra xem sinh vien co ton tai trong database khong
            String checkSV = "select exists(select * from sinhvien where masv = ?)";
            PreparedStatement pStmtCheck = conn.prepareStatement(checkSV);
            pStmtCheck.setString(1, id);
            ResultSet resultCheck = pStmtCheck.executeQuery();

            resultCheck.next();
            boolean exists = resultCheck.getBoolean(1);

            if(!exists){
                throw new Exception("Sinh Vien Co Ma So: " + id + " Khong Ton Tai");
            }

            String deleteSQL = "delete from sinhvien where masv = ?";
            PreparedStatement pStmt = conn.prepareStatement(deleteSQL);
            pStmt.setString(1, id);

            int resultDelete = pStmt.executeUpdate();

            pStmt.close();
            resultCheck.close();

            if(resultDelete > 0){
                System.out.println("Da Delete Thanh Cong Sinh Vien Co Ma So: " + id);
            }
        }catch (SQLException e){
            System.out.println("Loi Delete: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }

    @Override
    public SinhVien findSinhVien(String id) {
        SinhVien sinhVien = new SinhVien();

        Connection conn =  DatabaseConnection.getConnection();

        String querySQLFindSV = "select * from sinhvien where masv = ?";
        try {
            PreparedStatement pStmt = conn.prepareStatement(querySQLFindSV);
            pStmt.setString(1, id.trim().toUpperCase());
            ResultSet resultFindSV = pStmt.executeQuery();

            if(!resultFindSV.next()){
                System.out.println("Sinh Vien Co Ma So: " + id + " Khong Ton Tai");
                pStmt.close();
                DatabaseConnection.closeConnection();
                resultFindSV.close();
            }else{
                sinhVien.setId(resultFindSV.getString("masv"));
                sinhVien.setName(resultFindSV.getNString("hoten"));
                sinhVien.setNgaySinh(resultFindSV.getDate("ngaysinh"));
                sinhVien.setGioiTinh(resultFindSV.getNString("gioitinh"));
                sinhVien.setDiaChi(resultFindSV.getNString("diachi"));
                sinhVien.setMalop(resultFindSV.getString("malop"));
                sinhVien.setPassword(resultFindSV.getString("password"));

                pStmt.close();
                resultFindSV.close();
            }

        }catch (SQLException e){
            System.out.println("Loi Tim Sinh Vien: " + e.getMessage());
        }

        return sinhVien;
    }
}
