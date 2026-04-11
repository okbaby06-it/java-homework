import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort_arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(List.of(10, 2, -1, 4, 7, 3, 6));

        Collections.sort(arrayList);

        System.out.println(arrayList);

        //duyet foreach
        for(int ls : arrayList){
            System.out.print(ls + " ");
        }

        //duyet for
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
