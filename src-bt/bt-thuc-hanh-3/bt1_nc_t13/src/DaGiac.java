import java.util.Scanner;

public class DaGiac {
    //Số cạnh của đa giác
    //Mảng các số thực chứa kích thƣớc các cạnh của đa giác

    protected int soCanhDaGiac;
    protected double[] kichThuocCacCanh;

    //constructor
    public DaGiac(){
        this.soCanhDaGiac = 0;
        this.kichThuocCacCanh = null;
    }
    public DaGiac(int _soCanhDaGiac){
        this.soCanhDaGiac = _soCanhDaGiac;
        this.kichThuocCacCanh = new double[_soCanhDaGiac];
    }

    //get / set
    public int getSoCanhDaGiac(){
        return this.soCanhDaGiac;
    }
    public void setSoCanhDaGiac(int _soCanhDaGiac){
        this.soCanhDaGiac = _soCanhDaGiac;
    }
    public double[]getKichThuocCacCanh(){
        return this.kichThuocCacCanh;
    }
    public void setKichThuocCacCanh(double[] _kichThuocCachCanh){
        this.kichThuocCacCanh = _kichThuocCachCanh; //gan 2 mang
    }

    //method nhap gia tri cho cac canh cua da giac
    public void InputCanhDaGiac(){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Nhap so Canh cua Da Giac: ");
            this.setSoCanhDaGiac(scn.nextInt());
            if(this.getSoCanhDaGiac() < 3)
                System.out.println("So Canh phai >= 3");
        }while(this.getSoCanhDaGiac() < 3);

        //khoi tao kich thuoc so canh
        this.kichThuocCacCanh = new double[this.getSoCanhDaGiac()];

        System.out.println("---Nhap kich thuoc so canh---");
        for(int i = 0; i < this.getSoCanhDaGiac(); i++){
            do {
                System.out.print("Canh thu " + (i + 1) + ": ");
                this.kichThuocCacCanh[i] = scn.nextDouble();
                if(this.kichThuocCacCanh[i] <= 0){
                    System.out.println("Kich thuoc canh phai > 0");
                }
            }while(this.kichThuocCacCanh[i] <= 0);
        }
    }

    //method tinh chu vi
    public double ChuVi(){
        double chuVi = 0;
        for(int i = 0; i < this.getSoCanhDaGiac(); i++){
            chuVi += kichThuocCacCanh[i];
        }
        return chuVi;
    }

    //method hien thi thong tin
    public void Output(){
        System.out.println("So canh Da Giac: " + this.getSoCanhDaGiac());
        for(int i = 0; i < this.getSoCanhDaGiac(); i++){
            System.out.println("Kich thuoc canh " + (i + 1) + ": " + kichThuocCacCanh[i]);
        }
        System.out.println("Chu vi: " + ChuVi());
    }
}
