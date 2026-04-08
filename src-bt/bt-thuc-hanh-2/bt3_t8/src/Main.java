import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao Ngay: ");
        int ngay = scn.nextInt();

        System.out.print("Nhap vao Thang: ");
        int thang = scn.nextInt();

        System.out.print("Nhap vao Nam: ");
        int nam = scn.nextInt();

        if(checkHopLe(ngay, thang, nam)){
            System.out.println("Ngay / Thang / Nam Khong hop le");
        }else{
            int ngayThuX = ngayX(ngay, thang, nam);
            System.out.printf("Ngay %d/%d/%d la ngay thu %d trong nam", ngay, thang, nam , ngayThuX);
            System.out.println();

            if(checkNamNhuan(nam))
                System.out.printf("Nam %d la nam nhuan co 366 ngay", nam);
            else
                System.out.printf("Nam %d Khong la nam nhuan co 365 ngay", nam);
        }
    }

    //check nam nhuan
    public static boolean checkNamNhuan(int nam){
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }

    public static boolean checkHopLe(int ngay, int thang, int nam){
        if (nam < 1 || thang < 1 || thang > 12 || ngay < 1)
            return false;
        return false;
    }

    //return ve so ngay trong thang
    public static int soNgayTrongThang(int thang, int nam){
        switch (thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return checkNamNhuan(nam) ? 29 : 28;
            default:
                return -1;
        }
    }

    //tinh ngay thu bao nhieu trong nam
    public static int ngayX(int ngay, int thang, int nam){
        int soNgay = 0;

        //cong don so ngay cua cac thang truoc do
        for(int i = 0; i < thang; i++){
            soNgay += soNgayTrongThang(i, nam);
        }

        return soNgay + ngay + 1; // cong them ngay hien tai
    }
}