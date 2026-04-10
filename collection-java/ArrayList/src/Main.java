import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //declaration list
        ArrayList<String> arrList = new ArrayList<>();

        //add a element
        arrList.add("sv001");
        arrList.add("sv002");

        //return về số lượng phần tử của list
        int lenght = arrList.size(); //2

        //return về giá trị tại vị trí index
        String indexValue = arrList.get(0); //sv001

        //xóa phần tử theo vị trí index chỉ định
        //arrList.remove(1); //xóa sv002

        //xóa phần tử dựa vào giá trị
        //arrList.remove("sv002"); //xóa phần tử sv002 đầu tiên được tìm thấy trong list

        //đặt một element thay thế vào vị trí index chỉ định - gán đè nếu dữ liệu đã có
        arrList.set(1, "sv003");

        //kiểm tra collection có chứa phần tử nào đó hay không
        System.out.println(arrList.contains("sv001")); //true -> có; else -> false

        //sắp xếp list tăng dần
        Collections.sort(arrList);

        //đảo ngược list
        Collections.reverse(arrList);

        //kiểm tra list có rỗng không
        arrList.isEmpty();

        //xóa toàn bộ list
        arrList.clear();

        System.out.println(lenght);
        System.out.println(indexValue);
        System.out.println(arrList.toString());
    }
}