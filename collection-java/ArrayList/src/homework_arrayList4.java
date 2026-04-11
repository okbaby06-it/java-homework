import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class homework_arrayList4 {
    public static void main(String[] args) {
        //Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list
        //in ra vị trí index số đó

        Scanner scn = new Scanner(System.in);

        System.out.print("n: ");
        int n = scn.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            System.out.print("i = [" + i + "] = ");
            arrayList.add(scn.nextInt());
        }

        findMaxSecond(arrayList);
        findMinSecond(arrayList);
    }

    //func find max second
    public static void findMaxSecond(ArrayList <Integer> arrayList)
    {
        Collections.sort(arrayList);

        System.out.println("Max Second: " + arrayList.get(arrayList.size() - 2));
    }

    //func find min second

    public static void findMinSecond(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        System.out.println("Min Second: " + arrayList.get(arrayList.size() - 2));
    }
}
