import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao n: ");
        int n = scn.nextInt();

        //kiem tra n co la snt
        if(ToanHoc.laSoNguyenTo(n))
            System.out.printf("%d la so nguyen to \n", n );
        else
            System.out.printf("%d khong la so nguyen to \n", n );

        //kiem tra n co la so hoan hao
        if(ToanHoc.laSoHoanHao(n))
            System.out.printf("%d la so hoan hao \n", n  );
        else
            System.out.printf("%d khong la so hoan hao \n", n);

        //so chinh phuong
        ToanHoc.soChinhPhuong(n);

        //fibo n
        System.out.printf("Fibonaci cua %d la: ", n);
        System.out.println(ToanHoc.fibo(n));

    }
}