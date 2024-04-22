package Utils;

import Models.Profile;

public class StringUtils {
    public static String ambilNickname(Profile profile) {
        String[] split = profile.getFullname().split("\\s+");
        String nicknames = split[0];
        return nicknames;
    }

}
