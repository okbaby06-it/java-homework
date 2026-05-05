package model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Khoa extends Generic{
    //fields
    private String makhoa;
    private String tenKhoa;

    //constructor
    public Khoa (){}

    public Khoa(String makhoa, String tenKhoa) {
        this.makhoa = makhoa;
        this.tenKhoa = tenKhoa;
    }

    //get / set

    public String getMakhoa() {
        return makhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa.trim().toUpperCase();
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa.trim();
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Nhap Thong Tin Khoa----");
        System.out.print("Ma Khoa: ");
        setMakhoa(scn.nextLine());
        System.out.print("Ten Khoa: ");
        setTenKhoa(scn.nextLine());

        System.out.println();
    }

    @Override
    public void output() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Thong Tin Khoa----");
        System.out.println("Ma Khoa: " + getTenKhoa());
        System.out.println("Ma Khoa: " + getMakhoa());

        System.out.println();
    }
}
