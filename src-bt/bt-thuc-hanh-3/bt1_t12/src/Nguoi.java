import java.util.Scanner;

public class Nguoi {
    //fields hoTen, diaChi, namSinh
    private String hoTen;
    private String diaChi;
    private String namSinh;

    //constructor
    public Nguoi(){
        this.hoTen = "";
        this.diaChi = "";
        this.namSinh = "";
    }
    public Nguoi(String _hoTen, String _diaChi, String _namSinh){
        this.hoTen = _hoTen;
        this.diaChi = _diaChi;
        this.namSinh = _namSinh;
    }

    //get / set fields
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String _hoTen){
        this.hoTen = _hoTen;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public void setDiaChi(String _diaChi){
        this.diaChi = _diaChi;
    }
    public String getNamSinh(){
        return this.namSinh;
    }
    public void setNamSinh(String _namSinh){
        this.namSinh = _namSinh;
    }

    Scanner scn = new Scanner(System.in);
    //method nhap thong tin
    public void InputNguoi(){
        System.out.print("Ho ten: ");
        setHoTen(scn.nextLine());

        System.out.print("Dia chi: ");
        setDiaChi(scn.nextLine());

        System.out.print("Nam sinh: ");
        setNamSinh(scn.nextLine());

        System.out.println();
    }

    //method hien thi thong tin
    public void OutputNguoi(){
        System.out.println("---Thong tin Nguoi---");
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("Nam sinh: " + getNamSinh());

        System.out.println();
    }
}
