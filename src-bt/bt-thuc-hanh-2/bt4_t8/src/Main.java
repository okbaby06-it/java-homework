import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Nhap vao n: ");
        int n = scn.nextInt();

        System.out.println("=====Dung for=====");
        for(int i = 2; i < n; i++){
            if(MathPrime.isPrime(i))
                System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("=====Dung while=====");
        int i = 2;
        while(i < n){
            if(MathPrime.isPrime(i))
                System.out.print(i + " ");

            i++;
        }

        System.out.println();

        System.out.println("=====Dung do while=====");

        int j = 2;
        do{
            if(MathPrime.isPrime(j))
                System.out.print(j + " ");

            j++;
        }while (j < n);
    }
}