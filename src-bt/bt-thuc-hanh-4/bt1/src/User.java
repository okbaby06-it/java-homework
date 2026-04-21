import java.util.Scanner;

public class User {
    //fields
    private int id;
    private String userName;
    private String password;
    private String email;

    //constructor
    public User(){}
    public User(int _id, String _userName, String _password, String _email){
        this.id = _id;
        this.userName = _userName;
        this.password = _password;
        this.email = _email;
    }

    //get
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    //set
    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //input user
    public void InputUser(){
        Scanner scn = new Scanner(System.in);

        System.out.println("----Nhap Thong Tin User----");
        System.out.print("UserName: ");
        this.userName = scn.nextLine();
        System.out.print("Password: ");
        this.password = scn.nextLine();
        System.out.print("Email: ");
        this.email = scn.nextLine();
    }

    //output user with toString() method

    @Override
    public String toString() {
        return "User [id = " + id + ", username = " + userName + ", password = " + password +  ", email = " + email;
    }
}
