import java.util.Scanner;

public class SinhVien {
    //fields Họ tên, năm sinh, tuổi, lớp.
    private String maSV;
    private String hoTen;
    private String namSinh;
    private String tuoi;
    private String lop;

    //constructor
    public SinhVien(){
        this.maSV = "";
        this.hoTen = "";
        this.namSinh = "";
        this.tuoi = "";
        this.lop = "";
    }
    public SinhVien(String _maSV, String _hoTen, String _namSinh, String _tuoi, String _lop){
        this.maSV = _maSV;
        this.hoTen = _hoTen;
        this.namSinh = _namSinh;
        this.tuoi = _tuoi;
        this.lop = _lop;
    }

    //get / set fields
    public String getMaSV(){
        return this.maSV;
    }
    public void setMaSV(String _maSV){
        this.maSV = _maSV;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String _hoTen){
        this.hoTen = _hoTen;
    }
    public String getNamSinh(){
        return this.namSinh;
    }
    public void setNamSinh(String _namSinh){
        this.namSinh = _namSinh;
    }
    public String getTuoi(){
        return this.tuoi;
    }
    public void setTuoi(String _tuoi){
        this.tuoi = _tuoi;
    }
    public String getLop(){
        return this.lop;
    }
    public void setLop(String _lop){
        this.lop = _lop;
    }

    //method nhap thong tin

    public void InputSinhVien(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ma Sinh Vien: ");
        setMaSV(scn.nextLine());

        System.out.print("Ten Sinh Vien: ");
        setHoTen(scn.nextLine());

        System.out.print("Nam sinh: ");
        setNamSinh(scn.nextLine());

        System.out.print("Tuoi: ");
        setTuoi(scn.nextLine());

        System.out.print("Lop: ");
        setLop(scn.nextLine());
    }

    //method hien thi thong tin
    public void OutputSinhVien(){
        System.out.println("Ma Sinh Vien: " + getMaSV());
        System.out.println("Ten Sinh Vien: " + getHoTen());
        System.out.println("Nam sinh: " + getNamSinh());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Lop: " + getLop());
    }
}
