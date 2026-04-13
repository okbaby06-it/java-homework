public class Main {
    public static void main(String[] args) {
//        //khoi tao doi tuong sinh vien, sach
//        SinhVien sinhVien = new SinhVien();
//        Sach sach = new Sach();
//
//        sinhVien.InputSinhVien();
//        sach.InputSach();
//
//        //khoi tao doi tuong The muon
//        TheMuon theMuon = new TheMuon("tm001", "12/02/2025", "12/03/2025", sach, sinhVien);
//
//        theMuon.OutputTheMuon();

        //khoi tao doi tuong TheMuon
        TheMuon theMuon = new TheMuon();

        theMuon.InputTheMuon();
        theMuon.OutputTheMuon();
    }
}