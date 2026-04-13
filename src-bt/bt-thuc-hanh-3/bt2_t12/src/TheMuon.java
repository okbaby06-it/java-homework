import java.util.Scanner;

public class TheMuon {
    //số phiếu muợn , ngày mƣợn, hạn
    //trả, số hiệu sách(thong tin sach), và các thông tin riêng
    // về mỗi sinh viên đó
    private String soTheMuon;
    private String ngayMuon;
    private String hanTra;

    private Sach sach;
    private SinhVien sv;

    public TheMuon(){
        this.soTheMuon = "";
        this.ngayMuon = "";
        this.hanTra = "";

        this.sach = new Sach();
        this.sv = new SinhVien();
    }

    public TheMuon(String _soTheMuon, String _ngayMuon, String _hanTra, Sach _sach, SinhVien _sinhVien){
        this.soTheMuon = _soTheMuon;
        this.ngayMuon = _ngayMuon;
        this.hanTra = _hanTra;

        this.sach = _sach;
        this.sv = _sinhVien;
    }

    //get / set
    public String getSoTheMuon(){
        return this.soTheMuon;
    }
    public void setSoTheMuon(String _soTheMuon){
        this.soTheMuon = _soTheMuon;
    }
    public String getNgayMuon(){
        return this.ngayMuon;
    }
    public void setNgayMuon(String _ngayMuon){
        this.ngayMuon = _ngayMuon;
    }
    public String getHanTra(){
        return this.hanTra;
    }
    public void setHanTra(String _hanTra){
        this.hanTra = _hanTra;
    }

    public Sach getSach(){
        return sach;
    }
    public void setSach(Sach _sach){
        this.sach = _sach;
    }
    public SinhVien getSinhVien(){
        return sv;
    }
    public void setSinhVien(SinhVien _sinhVien){
        this.sv = _sinhVien;
    }

    //method nhap thong tin the muon
    public void InputTheMuon(){
        Scanner scn = new Scanner(System.in);

        System.out.print("So the muon: ");
        setSoTheMuon(scn.nextLine());

        System.out.print("Ngay muon: ");
        setNgayMuon(scn.nextLine());

        System.out.print("Han tra: ");
        setHanTra(scn.nextLine());

        System.out.println("---Thong tin Sinh Vien---");
        this.sv.InputSinhVien();

        System.out.println("---Thong tin Sach---");
        this.sach.InputSach();

        System.out.println();
    }

    //method xuat thong tin
    public void OutputTheMuon(){
        System.out.println("---Thong tin The Muon---");
        System.out.println("So the muon: " + getSoTheMuon());
        System.out.println("Ngay muon: " + getNgayMuon());
        System.out.println("Han tra: " + getHanTra());
        System.out.println("---Thong tin Sinh Vien muon sach---");
        this.sv.OutputSinhVien();
        System.out.println("---Thong tin Sach muon----");
        this.sach.OutputSach();
    }
}
