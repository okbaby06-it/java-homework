package model;

import java.util.Scanner;

public class Lop extends Generic{
    //fields
    private String maLop;
    private String tenLop;
    private String maKhoa;

    //constructor
    public Lop(){}

    public Lop(String maLop, String tenLop, String tenKhoa) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maKhoa = tenKhoa;
    }

    //get/set

    public String getMaLop() {
        return maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop.trim();
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop.trim();
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa.trim();
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Nhap Thong Tin Lop----");
        System.out.print("Ma Lop: ");
        setMaLop(scn.nextLine());
        System.out.print("Ten Lop: ");
        setTenLop(scn.nextLine());
        System.out.print("Ma Khoa: ");
        setMaKhoa(scn.nextLine());

        System.out.println();
    }

    @Override
    public void output() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Thong Tin Lop----");
        System.out.println("Ma Lop: " + getMaLop());
        System.out.println("Ten Lop: " + getTenLop());
        System.out.println("Ma Khoa: " + getMaKhoa());

        System.out.println();
    }
}
