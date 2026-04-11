import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework_arrayList {
    public static void main(String[] args) {
        //create mot list co n phan tu ngau nhien tu 1 - 100
        Scanner scn = new Scanner(System.in);

        System.out.print("n: ");
        int n = scn.nextInt();

        ArrayList<Integer> listRandom = new ArrayList<>(n);

        for(int i = 0; i < n; i++ ){
            Random rd = new Random();
            listRandom.add(rd.nextInt(1, 100));
        }

        System.out.println(listRandom);
    }
}
