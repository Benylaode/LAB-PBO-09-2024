package tp1;

public class User {
    private String username;
    private String password;
    private String photoFilename;

    public User(String username, String password, String photoFilename) {
        this.username = username;
        this.password = password;
        this.photoFilename = photoFilename;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhotoFilename() {
        return photoFilename;
    }
}
