import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class homework_arrayList3 {
    public static void main(String[] args) {
        //Viết chương trình nhập vào 1 list có n phần tử ngẫu nhiên,
        //các phần tử là số nguyên, n nhập từ bàn phím
        //#1 in ra có bao nhiêu số nhỏ hơn 80,
        //#2 và in ra vị trí index các số đó

        Scanner scn = new Scanner(System.in);

        System.out.print("n: ");
        int n = scn.nextInt();

        ArrayList <Integer> arrayList = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            System.out.print("i = [" + i + "] = ");
            arrayList.add(scn.nextInt());
        }

        //call func
        find80(arrayList);
    }

    //func tim cac so <80
    public static void find80(ArrayList <Integer> arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) < 80){
                System.out.printf("Value: %d - Index: %d", arrayList.get(i), i);
                System.out.println();
            }
        }
    }
}
