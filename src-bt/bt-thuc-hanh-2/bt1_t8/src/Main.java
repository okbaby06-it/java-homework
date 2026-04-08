public class Main {
    //Viết chƣơng trình in ra giá trị tăng giảm của biến i cho trƣớc.
    public static void main(String[] args) {
        int i = 5;

        System.out.println("=====TĂNG DẦN=====");

        //tăng hậu tố i++
        System.out.println("i ban đầu = " + i);
        System.out.println("i++ = " + (i++)); // in i rồi mới tăng
        System.out.println("Sau i++, i = " + i);

        i = 5; // reset i

        //tăng tiền tố ++i
        System.out.println("\ni ban đầu = " + i);
        System.out.println("++i = " + (++i)); // tăng rồi mới in
        System.out.println("Sau ++i, i = " + i);

        System.out.println("\n=====GIẢM DẦN=====");

        i = 5; // reset lại giá trị ban đầu

        //giảm hậu tố (i--)
        System.out.println("i ban đầu = " + i);
        System.out.println("i-- = " + (i--)); // in i rồi mới giảm
        System.out.println("Sau i--, i = " + i);

        i = 5; //reset i

        //giảm tiền tố --i
        System.out.println("\ni ban đầu = " + i);
        System.out.println("--i = " + (--i)); // giảm rồi mới in
        System.out.println("Sau --i, i = " + i);
    }
}