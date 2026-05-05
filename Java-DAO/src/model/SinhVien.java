package model;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class SinhVien extends Generic{
    //fields
    private String id;
    private String name;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String malop;
    private String password;

    //constructor

    public SinhVien(){}
    public SinhVien(String id, String name, Date ngaySinh, String gioiTinh, String diaChi, String malop, String password) {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.malop = malop;
        this.password = password;
    }

    //get/ set

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMalop() {
        return malop;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        id = id.strip().trim().toUpperCase();

        if(id == null || id.isEmpty())
            throw new IllegalArgumentException("Lỗi! Mã Sinh Viên Không Được Để Trống");

        //kiểm tra xem ký tự đầu tiên có phải là chữ cái không
        if(!Character.isLetter(id.charAt(0)))
            throw new IllegalArgumentException("Lỗi! Mã Sinh Viên Không Đúng Định Dạng! Mã Sinh Viên Phải Bắt Đầu Bằng Chữ Cái");

        //kiểm tra xem mã có đúng định dạng là chữ hoặc số không
        for(int i = 1; i < id.length(); i++){
            if(!Character.isLetterOrDigit(id.charAt(i)))
                throw new IllegalArgumentException("Lỗi! Mã Sinh Viên Không Đúng Định Dạng");
        }

        this.id = id.toUpperCase();
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh.trim();
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi.trim();
    }

    public void setMalop(String malop) {
        if(malop == null || malop.trim().isEmpty())
            throw new IllegalArgumentException("Lỗi! Mã Lớp Không Được Để Trống");

        //kiểm tra xem ký tự đầu tiên có phải là chữ cái không
        if(!Character.isLetter(malop.charAt(0)))
            throw new IllegalArgumentException("Lỗi! Mã Lớp Không Đúng Định Dạng! Mã Lớp Phải Bắt Đầu Bằng Chữ Cái");

        //kiểm tra xem mã có đúng định dạng là chữ hoặc số không
        for(int i = 1; i < malop.length(); i++){
            if(!Character.isLetterOrDigit(malop.charAt(i)))
                throw new IllegalArgumentException("Lỗi! Mã Lớp Không Đúng Định Dạng");
        }

        this.malop = malop.toUpperCase();
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }

    //input
    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Nhap Thong Tin Sinh Vien----");
        System.out.print("Ma Sinh Vien: ");
        setId(scn.nextLine());
        System.out.print("Ho Ten: ");
        setName(scn.nextLine());
        System.out.print("Ngay Sinh (yyyy-mm-dd): ");
        setNgaySinh(java.sql.Date.valueOf(scn.nextLine())); //ava.sql.Date.valueOf() -> chuyển từ String -> Date trong sql
        System.out.print("Gioi Tinh: ");
        setGioiTinh(scn.nextLine());
        System.out.print("Dia Chi: ");
        setDiaChi(scn.nextLine());
        System.out.print("Ma Lop: ");
        setMalop(scn.nextLine());
        System.out.print("Password: ");
        setPassword(scn.nextLine());

        System.out.println();
    }

    @Override
    public void output() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Thong Tin Sinh Vien----");
        System.out.println("Ma Sinh Vien: " + getId());
        System.out.println("Ho Ten: " + getName());
        System.out.println("Ngay Sinh: " + getNgaySinh().toString());
        System.out.println("Gioi Tinh: " + getGioiTinh());
        System.out.println("Dia Chi: " + getDiaChi());
        System.out.println("Ma Lop: " + getMalop());
        System.out.println("Password: " + getPassword());

        System.out.println();
    }
}
