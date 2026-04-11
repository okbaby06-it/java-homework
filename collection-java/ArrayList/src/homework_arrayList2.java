import java.util.ArrayList;
import java.util.Scanner;

public class homework_arrayList2 {
    public static void main(String[] args) {
        //nhap vao mot list co n phan tu
        // - tao ra mot list moi binh phuong cac phan tu
        // - xac dinh cac phan tu >50

        Scanner scn  = new Scanner(System.in);

        System.out.print("n: ");
        int n = scn.nextInt();

        ArrayList <Integer> arrayList = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            System.out.print("i = [" + i + "] = ");
            arrayList.add(scn.nextInt());
        }

        ArrayList <Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++){
            arrayList2.add(arrayList.get(i) * arrayList.get(i));
        }

        System.out.println(arrayList);
        System.out.println(arrayList2);

        System.out.println("So luong phan tu > 50: " + findValue(arrayList2));
    }

    //func xác định phần tử >50
    public static int findValue(ArrayList <Integer> arrayListFind){
        int count = 0;

        for(int i : arrayListFind){
            if(i > 50){
                count++;
            }
        }
        return count;
    }
}
