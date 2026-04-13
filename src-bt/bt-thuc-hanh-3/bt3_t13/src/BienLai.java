import java.util.Scanner;

public class BienLai {
    //fiedls thông tin về hộ sử dụng điện, chỉ số cũ,
    //chỉ số mới, số tiền phải trả của mỗi hộ sử dụng điện

    private KhachHang khachHang;
    private double chiSoCu;
    private double chiSoMoi;
    private double soTienPhaiTra;

    //constructor
    public BienLai(){
        this.khachHang = new KhachHang();
        this.chiSoCu = 0.0;
        this.chiSoMoi = 0.0;
        this.soTienPhaiTra = 0.0;
    }
    public BienLai(KhachHang _khachHang, double _chiSoCu, double _chiSoMoi){
        this.khachHang = _khachHang;
        this.chiSoCu = _chiSoCu;
        this.chiSoMoi = _chiSoMoi;
    }

    //get / set
    public KhachHang getKhachHang(){
        return this.khachHang;
    }
    public void setKhachHang(KhachHang _khachHang){
        this.khachHang = _khachHang;
    }
    public double getChiSoCu(){
        return this.chiSoCu;
    }
    public void setChiSoCu(double _chiSoCu){
        this.chiSoCu = _chiSoCu;
    }
    public double getChiSoMoi(){
        return this.chiSoMoi;
    }
    public void setChiSoMoi(double _chiSoMoi){
        this.chiSoMoi = _chiSoMoi;
    }

    //method nhap thong tin bien lai
    public void InputBienLai(){
        System.out.println("----Thong tin Khach Hang----");
        this.khachHang.InputKhachHang();
        System.out.println("----Thong tin Bien Lai----");
        Scanner scn = new Scanner(System.in);
        System.out.print("Chi so Cu: ");
        setChiSoCu(Double.parseDouble(scn.nextLine()));
        do {
            System.out.print("Chi so Moi: ");
            setChiSoMoi(Double.parseDouble(scn.nextLine()));
            if(getChiSoMoi() < getChiSoCu())
                System.out.println("Chi so moi phai lon hon chi so cu");
        }while (this.chiSoMoi < this.chiSoCu);
    }

    //method hien thi thong tin bien lai
    public void OutputBienLai(){
        System.out.println("----Thong tin Khach Hang----");
        this.khachHang.OutputKhachHang();
        System.out.println("Chi so Cu: " + getChiSoCu());
        System.out.println("Chi so Moi: " + getChiSoMoi());
        System.out.println("So tien phai tra: " + TinhTienDien());

        System.out.println();
    }

    //method tinh tien dien
    private double TinhTienDien(){
        return (getChiSoMoi() - getChiSoCu()) * 850000;
    }
}
