import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("So Khach Hang su dung dien: " );
        int n = scn.nextInt();

        //khoi tao mang doi tuong BienLai (ung voi moi bien lai la 1 Khach Hang)
        BienLai[] bienLai = new BienLai[n];
        for(int i = 0; i < n; i++){
            System.out.println("=======THONG TIN HO THU: " + (i + 1));
            bienLai[i] = new BienLai();
            bienLai[i].InputBienLai();
        }

        for(int i = 0; i < n; i++){
            System.out.println("=======THONG TIN HO THU: " + (i + 1));
            bienLai[i].OutputBienLai();
        }
    }
}