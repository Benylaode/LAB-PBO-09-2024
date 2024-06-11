package tugas;

import java.util.ArrayList;
import java.util.Scanner;
import tugas.models.Profile;
import tugas.models.User;
import tugas.utils.StringUtils;
public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Keluar");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        switch (selectMenu) {
            case 1:
                if (listUser.isEmpty()) {
                    System.out.println("Belum ada User yang terdaftar, Register terlebih dahulu");
                    showRegisterMenu();
                } else {
                    showLoginMenu();
                }
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
                break;
            case 3:
                System.out.println("TERIMAKASIH SUDAH MENGAKSES");
                System.exit(0);
                break;
            default:
                System.out.println("Inputan salah, silahkan pilih ulang : ");
                // Mengulang Pemanggilan Menu Utama
                runApp();
                break;
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getusername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();
            boolean passwordCorrect = listUser.get(userIndex).getpassword().equals(password);

            // Jika passwordnya sama maka berhasil login
            if (passwordCorrect) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                runApp();
            } else {
                System.out.println("Password Salah");
                showLoginMenu();
            }
        } else {
            System.out.println("username tidak ditemukan");
            showLoginMenu();
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        
        // Check for duplicate username
        for (User user : listUser) {
            if (user.getusername().equals(username)) {
                System.out.println("Username sudah terdaftar, Silahkan input ulang");
                showRegisterMenu();
                return;
            }
        }

        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        while (fullName.isEmpty()) {
            System.out.println("Nama Lengkap tidak boleh kosong!!\nNama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
        }

        System.out.println("Umur");
        System.out.print("> ");
        int age = 0;
        while (true) {
            String n = sc.nextLine();
            if (!n.isEmpty()) {
                try {
                    age = Integer.parseInt(n);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inputan salah. Harap masukkan angka.");
                    System.out.print("> ");
                }
            } else {
                System.out.println("Inputan kosong, Masukkan Ulang!!\nUmur");
                System.out.print("> ");
            }
        }

        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        while (hobby.isEmpty()) {
            System.out.println("Inputan kosong, Input ulang!!\nHobby");
            System.out.print("> ");
            hobby = sc.nextLine();
        }

        Profile profile = new Profile();
        profile.setfullname(fullName);
        profile.setAge(age);
        profile.sethobby(hobby);

        User user = new User(username, password);
        listUser.add(user);

        String nickname = StringUtils.BuatNickname(fullName);
        profile.setNickname(nickname);

        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("--------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("--------------------------");
        System.out.println("Nama Lengkap   : " + profile.getfullname());
        System.out.println("Nama Panggilan : " + profile.getnickname());
        System.out.println("Umur           : " + profile.getage());
        System.out.println("Hobby          : " + profile.gethobby());
    }
}
