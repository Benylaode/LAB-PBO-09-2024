package login_app.utils;

public class StringUtils {
    public static String BuatNickname(String fullname) {
        String[] names = fullname.split(" ");
        if(names.length == 1) {
            return fullname;
        }else{
            return names[1];
        }
}
}
