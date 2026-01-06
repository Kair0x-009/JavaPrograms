package HospitalManagementSystem;

public class User {
    protected int user_id;
    protected String username;
    protected String password;

    public User(String password, int user_id, String username) {
        this.password = password;
        this.user_id = user_id;
        this.username = username;
    }

    public void changeUsername(String username) {
        this.username = username;
    }
    public void printDetails() {
        System.out.println("User{user_id =" + user_id +
                ", username='" + username + '\'' +
                '}');
    }
}
