package login_app.models;

public class Profile {
    String fullname,hobby,nickname;
    int age;

    public Profile(){

    }
    
    public Profile(String fullname,String hobby,String nickname, int age){
        this.fullname = fullname;
        this.hobby = hobby;
        this.age = age;
        this.nickname = nickname;

    }

    public String getfullname() {
        return fullname;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }

    public String gethobby() {
        return hobby;
    }

    public void sethobby(String hobby) {
        this.hobby = hobby;
    }

    public int getage() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getnickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    
}
