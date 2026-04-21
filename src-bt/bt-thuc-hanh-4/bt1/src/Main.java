public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.InputUser();

        UserDAO userDAO = new UserDAO();

        if(userDAO.addUser(user))
            System.out.println("Them Thanh Cong User");
    }
}