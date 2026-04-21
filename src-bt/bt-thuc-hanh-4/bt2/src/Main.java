import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //-----find-----
//        User user = new User();
//
//        UserDAO userDAO = new UserDAO();
//
//        System.out.print("Nhap vao UserName can tim: ");
//        String userName = scn.nextLine();
//
//        user = userDAO.findUserName(userName);
//        System.out.println("Thong tin " +  user);

        //-----update------
        System.out.println("----Nhap vao thong tin email can update----");
        System.out.print("Id: ");
        int id = Integer.parseInt(scn.nextLine());

        System.out.print("Email: ");
        String email = scn.nextLine();

        UserDAO userDAO = new UserDAO();

        if(userDAO.updateUserEmail(id, email))
            System.out.println("Update thanh cong");


    }
}