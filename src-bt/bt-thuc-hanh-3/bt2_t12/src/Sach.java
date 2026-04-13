import java.util.Scanner;

public class Sach {
    //fields
    private String maSach;
    private String tenSach;

    //constructor
    public Sach(){
        this.maSach = "";
        this.tenSach = "";
    }
    public Sach(String _maSach, String _tenSach){
        this.maSach = _maSach;
        this.tenSach = _tenSach;
    }

    //get / set
    public String getMaSach(){
        return this.maSach;
    }
    public void setMaSach(String _maSach){
        this.maSach = _maSach;
    }
    public String getTenSach(){
        return this.tenSach;
    }
    public void setTenSach(String _tenSach){
        this.tenSach = _tenSach;
    }

    //method nhap thong tin sach
    public void InputSach(){
        Scanner scn = new Scanner(System.in);

        System.out.print("Ma Sach: ");
        setMaSach(scn.nextLine());

        System.out.print("Ten Sach: ");
        setTenSach(scn.nextLine());
    }

    //method hien thi thong tin sach
    public void OutputSach(){
        System.out.println("Ma Sach: " + getMaSach());
        System.out.println("Ten Sach: " + getTenSach());
    }
}
