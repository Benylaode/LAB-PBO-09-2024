package login_app;

import java.util.ArrayList;

import login_app.models.Profile;
import login_app.models.User;

public class Database {
    static ArrayList<Profile> profiles = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    static {
        User user1 = new User("name", "password");
        users.add(user1);
        Profile profile1 = new Profile();
        profile1.setFullName("fullname");
        profile1.setNickname("nickname");
        profile1.setAge(0);
        profile1.setHobby("Mm");
        profiles.add(profile1);
    }
}
