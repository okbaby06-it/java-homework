public class ToanHoc {
    //check mot so n co la snt
    public static boolean laSoNguyenTo(int n){
        if(n < 2)
            return false;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    //check mot so n co la so hoan hao
    public static boolean laSoHoanHao(int n){
        //Bằng tổng các ước số dương của nó (không tính chính nó)

        if(n <= 1)
            return false;

        int s = 0;

        for(int i = 1; i < n / 2; i++){
            if(n % i == 0)
                s += i;
        }
        return s == n;
    }

    //tim va in ra cac so chinh phuong
    public static void soChinhPhuong(int n){
        //dạng bình phương của một số nguyên
        String scp = "";
        for(int i = 1; i * i <= n; i++){
            scp += (i * i) + ", ";
        }

        System.out.println("So chinh phuong: " + scp);
    }

    //tinh fibo
    public static int fibo(int n){
        //F(0) = 0
        //F(1) = 1
        //F(n) = F(n-1) + F(n-2)
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
