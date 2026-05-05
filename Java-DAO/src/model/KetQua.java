package model;

import java.util.Scanner;

public class KetQua extends Generic{
    private String id;
    private String maMon;
    private float diem;

    //constructor
    public KetQua(){}
    public KetQua(String id, String maMon, float diem) {
        this.id = id;
        this.maMon = maMon;
        this.diem = diem;
    }

    //get/set

    public String getId() {
        return id;
    }

    public String getMaMon() {
        return maMon;
    }

    public float getDiem() {
        return diem;
    }

    public void setId(String id) {
        if(id == null || id.trim().isEmpty())
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

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Nhap Thong Tin Ket Qua----");
        System.out.print("Ma Sinh Vien: ");
        setId(scn.nextLine());
        System.out.print("Ma Mon: ");
        setMaMon(scn.nextLine());
        System.out.print("Diem: ");
        setDiem(Float.parseFloat(scn.nextLine()));

        System.out.println();
    }

    @Override
    public void output() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Thong Tin Ket Qua----");
        System.out.println("Ma Sinh Vien: " + getId());
        System.out.println("Ma Mon: " + getMaMon());
        System.out.println("Diem: " + getDiem());

        System.out.println();
    }
}
