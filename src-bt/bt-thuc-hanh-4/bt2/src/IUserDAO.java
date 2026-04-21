public interface IUserDAO {
    boolean addUser(User user);
    User findUserName(String userName);
    boolean updateUserEmail(int id, String email);
}
