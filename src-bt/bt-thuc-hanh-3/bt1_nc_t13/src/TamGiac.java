import java.util.Scanner;

public class TamGiac extends DaGiac{
    public TamGiac(){
        super(3); // tam giac luon co 3 canh
    }

    //override nhap

    @Override
    public void InputCanhDaGiac() {
        Scanner scn = new Scanner(System.in);

        this.setSoCanhDaGiac(3); //tam giac luon co 3 canh
        this.kichThuocCacCanh = new double[3];

        System.out.println("---Nhap kich thuoc Tam Giac---");
        for(int i = 0; i < 3; i++){
            do {
                System.out.print("Nhap canh thu " + (i + 1) + ": ");
                this.kichThuocCacCanh[i] = scn.nextDouble();
                if(this.kichThuocCacCanh[i] <= 0)
                    System.out.println("Kich thuoc canh khong duoc <= 0");
            }while(this.kichThuocCacCanh[i] <= 0);
        }
    }

    //override hienthi
    @Override
    public void Output(){
        System.out.println("---Thong tin Tam Giac---");
        System.out.println("Canh thu 1: " + this.kichThuocCacCanh[0]);
        System.out.println("Canh thu 2: " + this.kichThuocCacCanh[1]);
        System.out.println("Canh thu 2: " + this.kichThuocCacCanh[2]);
        System.out.println("Chu vi: " + ChuVi());
        System.out.println("Dien tich: " + DienTichTamGiac());
    }

    //override chu vi
    @Override
    public double ChuVi(){
        return super.ChuVi();
    }

    //method tinh dien tich tam giac
    public double DienTichTamGiac(){
        double canh1 = this.kichThuocCacCanh[0];
        double canh2 = this.kichThuocCacCanh[1];
        double canh3 = this.kichThuocCacCanh[2];

        //nua chu vi
        double  p = (canh1 + canh2 + canh3) / 2;

        double dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));

        return dienTich;
    }
}
