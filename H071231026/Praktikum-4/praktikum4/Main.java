package praktikum4;

import java.util.ArrayList;
import java.util.Scanner;
import praktikum4.models.Profile;
import praktikum4.models.User;
import praktikum4.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Keluar");
        System.out.print("> ");

        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showRegisterMenu();
                break;
            case 3:
                System.out.println("-------------------------\nSAMPAI JUMPA !!\n-------------------------");
            
        }
    }

    private static void showLoginMenu() {
        boolean isPasswordMatch;
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).username.equals(username)){
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();

            if (listUser.get(userIndex).password.equals(password)){
                isPasswordMatch = true;
            } else {
                isPasswordMatch = false;
            }
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Gagal Login!");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = new User(username, password);
        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        profile.setFullname(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        String nickname = StringUtils.nickName(fullName);
        profile.setNickname(nickname);
        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------\nSELAMAT DATANG !!\n-------------------------");
        System.out.println("Nama Lengkap   : "+ profile.getFullname());
        System.out.println("Nama Panggilan : "+ profile.getNickname());
        System.out.println("Umur           : "+ profile.getAge());
        System.out.println("Hobby          : "+ profile.getHobby());
        System.out.println("-------------------------");
        runApp();
    
    }
}