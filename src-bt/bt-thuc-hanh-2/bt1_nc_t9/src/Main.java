import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao n: ");
        int n = scn.nextInt();

        System.out.print("Nhap vao k: ");
        int k = scn.nextInt();

        System.out.print("Nhap vao x: ");
        int x = scn.nextInt();

        double s = 0.0;

        for(int i = 1; i <= n; i++){
            //tu
            double tu = fac(i);

            //tinh x mu i
            double xMuI = Math.pow(x, i);

            //tinh k mu i
            double kMuI = Math.pow(k, i);

            //mau
            double mau;
            if(i % 2 == 1){
                mau = xMuI + kMuI;
            }else{
                mau = xMuI - kMuI;
            }

            s += (double) tu / mau;
        }

        System.out.println("Tong S: " + s);

    }

    // func factorial
    public static long fac(int n){
        if (n == 0 || n == 1) return 1;
        long fac = 1;
        for(int i = 2; i <= n; i++){
            fac *= i;
        }
        return fac;
    }
}