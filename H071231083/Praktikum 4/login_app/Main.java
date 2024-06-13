package login_app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    // private static ArrayList<User> listUser = Database.users;
    // private static ArrayList<Profile> listUserProfile = Database.profiles;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        boolean valid = false;
        while (!valid) {
            try {
                runApp();
                valid = true;
            } catch (Exception e) {
                // TODO: handle exception
                sc.nextLine();
                System.out.println("Error : " + e.getMessage());
            }
        }
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        if (sc.hasNextInt()) {
            int selectMenu = sc.nextInt();
            // sc.nextLine();
            switch (selectMenu) {
                case 1:
                    // Membuka Halaman Login
                    showLoginMenu();
                    break;
                case 2:
                    // Membuka Halaman Register
                    showRegisterMenu();
                    break;
                default:
                    throw new InputMismatchException("Input bukan 1 atau 2.");
            }
        } else {
            throw new InputMismatchException("Input tidak valid (Masukkan input 1 atau 2).");
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");

        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");
        String username = sc.next();

        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < Database.users.size(); i++) {
            /*
             * TODO
             * Buatlah sebuah perkondisian (IF) yang akan
             * Mengecek apakah user index ke i dari listUser memiliki username yang sama
             * dengan username yang
             * diinput.
             * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
             * perulangan
             */
            if (Database.users.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * TODO
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */

            boolean isPasswordMatch = false;
            if (Database.users.get(userIndex).getPassword().equals(password)) {
                isPasswordMatch = true;
            }

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                /*
                 * TODO
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 *
                 */
                showDetailUser(Database.profiles.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
                throw new NoSuchElementException();
            }
        } else {
            throw new NoSuchElementException("Username tidak ditemukan. Silahkan registrasi terlebih dahulu");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.next();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.next();
        sc.nextLine();
        /*
         * TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(username, password);
        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile();

        // Menginput Data Profile
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

        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        profile.setNickname(StringUtils.getNickname(profile.getFullName()));

        // Menambahkan user yang dibuat ke list user
        Database.users.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        Database.profiles.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
        System.out.println("-----------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-----------------------------");
        System.out.println("Nama Lengkap    : " + profile.getFullName());
        System.out.println("Nama Panggilan  : " + profile.getNickname());
        System.out.println("Umur            : " + profile.getAge());
        System.out.println("Hobby           : " + profile.getHobby());
    }
}
