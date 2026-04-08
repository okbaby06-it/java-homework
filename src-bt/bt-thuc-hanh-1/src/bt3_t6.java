import java.util.Scanner;

public class bt3_t6 {
    //1. Sử dụng lớp Scanner trong gói java.util
    //2. Sử dụng phƣơng thức nextInt() để nhập vào hai số a, b in kết quả tổng, hiệu của a và b ra màn hình.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao so a: ");
        int a = scn.nextInt();

        System.out.print("Nhap vao so a: ");
        int b = scn.nextInt();

        System.out.println("Tong cua hai so a va b: " + (a + b));
        System.out.println("Hieu cua hai so a va b: " + (a - b));
    }
}
