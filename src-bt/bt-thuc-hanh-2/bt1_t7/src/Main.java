import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao gia tri n: ");
        int n = scn.nextInt();

        System.out.println("Tong day: " + ToanHoc.TinhTong(n));
    }
}