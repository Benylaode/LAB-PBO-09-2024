package tugas.models;

public class Profile {
    String fullname, hobby, nickname;
    int age;

    // Constructors
    public Profile() {
    }

    public Profile(String fullname, String hobby, String nickname, int age) {
        this.fullname = fullname;
        this.hobby = hobby;
        this.age = age;
        this.nickname = nickname;
    }

    // Getter and setter methods for fullname
    public String getfullname() {
        return fullname;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }

    // Getter and setter methods for hobby
    public String gethobby() {
        return hobby;
    }

    public void sethobby(String hobby) {
        this.hobby = hobby;
    }

    // Getter and setter methods for age
    public int getage() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for nickname
    public String getnickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
