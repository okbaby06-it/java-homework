import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class bt2_t6 {
    //1. Khai báo (import) lớp Scanner trong gói java.util
    //2. Sử dụng phƣơng thức nextLine() của lớp để nhập vào một xâu và in xâu vừa nhập
    //ra màn hình.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap vao mot xau: ");

        String strings = scn.nextLine();

        System.out.println("Xau vua nhap la: " + strings);
    }
}
