import java.util.Scanner;

public class KhachHang {
    //fields
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String email;

    //constructor
    public KhachHang(){
        this.hoTen = "";
        this.diaChi = "";
        this.soDienThoai = "";
        this.email = "";
    }
    public KhachHang(String _hoTen, String _diaChi, String _soDienThoai, String _email){
        this.hoTen = _hoTen;
        this.diaChi = _diaChi;
        this.soDienThoai = _soDienThoai;
        this.email = _email;
    }

    //get / set fields
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String _hoten){
        this.hoTen = _hoten;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public void setDiaChi(String _diaChi){
        this.diaChi = _diaChi;
    }
    public String getSoDienThoai(){
        return this.soDienThoai;
    }
    public void setSoDienThoai(String _soDienThoai){
        this.soDienThoai = _soDienThoai;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String _email){
        this.email = _email;
    }

    Scanner scn = new Scanner(System.in);
    //method nhap thong tin khach hang
    public void InputKhachHang(){
        System.out.print("Ho ten: ");
        setHoTen(scn.nextLine());

        System.out.print("Dia chi: ");
        setDiaChi(scn.nextLine());

        System.out.print("So Dien Thoai: ");
        setSoDienThoai(scn.nextLine());

        System.out.print("Email: ");
        setEmail(scn.nextLine());

        System.out.println();
    }

    //method hien thi thong tin khach hang
    public void OutputKhachHang(){
        System.out.println("---Thong tin khach hang---");
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("So Dien Thoai: " + getSoDienThoai());
        System.out.println("Email: " + getEmail());
    }
}
