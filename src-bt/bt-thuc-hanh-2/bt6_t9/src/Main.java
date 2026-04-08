import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scn.nextInt();

        //1.
        int s1 = 0;
        for(int i = 0; i <= n; i++){
            if(i == 1)
                s1 += i;
            else if(i % 2 == 0)
                s1 += i;
            else
                s1 -= i;
        }

        System.out.println("S1 la: " + s1);

        //2.
        long gt = 0;
        long fac = 1;
        for(int i = 1; i <= n; i++){
            fac *= i; // tinh giai thua
            gt += fac; // cong don
        }
        System.out.printf("Giai thua cua %d la: %d \n", n, gt);

        //3.
        int s2 = 0;
        if(n % 2 == 0){ //chan
            for(int i = 0; i < n; i += 2){
                s2 += i;
            }
            System.out.printf("%d la so chan, tong cac so chan nho hon %d la: %d\n", n, n, s2);
        }else{ // le
            for(int i = 1; i < n; i += 2){
                s2 += i;
            }
            System.out.printf("%d la so le, tong cac so le nho hon %d la: %d\n", n, n, s2);
        }

        //4.
        double s3 = 0.0;
        for(int i = 1; i < n; i++){
            s3 += (double ) i / (i + 1);
        }
        System.out.println("S3: " + s3);
    }
}