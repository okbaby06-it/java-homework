import java.util.Scanner;

public class Main {
    //Viết các chƣơng trình nhập vào một số nguyên n và in ra số nhị phân tƣơng ứng với n.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao n: ");
        int n = scn.nextInt();

        if(n == 0)
            System.out.println(n);
        else
            nhiPhan(n);
    }

    //func de quy
    public static void nhiPhan(int n){
        if(n > 1)
            nhiPhan(n / 2);
        System.out.print(n % 2);
    }
}