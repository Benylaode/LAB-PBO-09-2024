package tugas.models;

public class User {
    String username, password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and setter methods for username
    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    // Getter and setter methods for password
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
