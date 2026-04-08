import java.util.Scanner;

public class bt2_nc_t6 {
    //Viết chƣơng trình: Nhập vào 2 số kiểu số thực float, double (sử dụng với các
    //phƣơng thức nextFloat(), nextDouble(), in ra các kết quả của các phếp tính, tổng, hiệu,
    //tích, thƣơng, lấy phần dƣ của các số đó.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao so thuc a: ");
        float a = scn.nextFloat();

        System.out.print("Nhap vao so thuc b: ");
        double b = scn.nextDouble();

        System.out.println("Tong cua 2 so " + a + " va " + b + ": " + (a + b));
        System.out.println("Hieu cua 2 so " + a + " va " + b + ": " + (a - b));
        System.out.println("Tich cua 2 so " + a + " va " + b + ": " + (a * b));
        System.out.println("Thuong cua 2 so " + a + " va " + b + ": " + (a / b));
        System.out.println("Du cua 2 so " + a + " va " + b + ": " + (a % b));
    }
}
