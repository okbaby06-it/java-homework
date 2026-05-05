package model;

import java.util.Scanner;

public class MonHoc extends Generic{
    //fields
    private String maMon;
    private String tenMon;
    private int tinChi;

    //constructor
    public MonHoc(){}
    public MonHoc(String maMon, String tenMon, int tinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
    }

    //get/set

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon.toUpperCase();
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon.trim();
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Nhap Thong Tin Mon Hoc----");
        System.out.print("Ma Mon: ");
        setMaMon(scn.nextLine());
        System.out.print("Ten Mon: ");
        setTenMon(scn.nextLine());
        System.out.print("Tin Chi: ");
        setTinChi(Integer.parseInt(scn.nextLine()));

        System.out.println();
    }

    @Override
    public void output() {
        Scanner scn = new Scanner(System.in);

        System.out.println("----Thong Tin Mon Hoc----");
        System.out.println("Ma Mon: " + getMaMon());
        System.out.println("Ten Mon: " + getTenMon());
        System.out.println("Tin Chi: " + getTinChi());

        System.out.println();
    }
}
