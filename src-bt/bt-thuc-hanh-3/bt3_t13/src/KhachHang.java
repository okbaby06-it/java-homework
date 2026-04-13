import java.util.Scanner;

public class KhachHang {
    //fields Họ tên chủ hộ, số nhà, mã số công tơ của hộ dân sử dụng điện.
    private String tenKH;
    private String soNha;
    private String maSoCongTo;

    //constructor
    public KhachHang(){
        this.tenKH = "";
        this.soNha = "";
        this.maSoCongTo = "";
    }
    public KhachHang(String _tenKH, String _soNha, String _maSoCongTo){
        this.tenKH = _tenKH;
        this.soNha = _soNha;
        this.maSoCongTo = _maSoCongTo;
    }

    //get / set
    public String getTenKH(){
        return this.tenKH;
    }
    public void setTenKH(String _tenKH){
        this.tenKH = _tenKH;
    }
    public String getSoNha(){
        return this.soNha;
    }
    public void setSoNha(String _soNha){
        this.soNha = _soNha;
    }
    public String getMaSoCongTo(){
        return this.maSoCongTo;
    }
    public void setMaSoCongTo(String _maSoCongTo){
        this.maSoCongTo = _maSoCongTo;
    }

    //method nhap thong tin khach hang
    public void InputKhachHang(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ten Khach Hang: ");
        setTenKH(scn.nextLine());

        System.out.print("So nha: ");
        setSoNha(scn.nextLine());

        System.out.print("Ma so cong to: ");
        setMaSoCongTo(scn.nextLine());
    }

    //method hien thi thong tin khach hang
    public void OutputKhachHang(){
        System.out.println("Ten Khach Hang:" + getTenKH());
        System.out.println("So nha: " + getSoNha());
        System.out.println("Ma so cong to: " + getMaSoCongTo());
    }
}
