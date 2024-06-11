import java.util.Scanner;

public class Keluarga {
    boolean statusMenikah; // Variabel untuk menyimpan status menikah
    String cekNikah; // Variabel untuk menyimpan input status menikah dari pengguna
    Scanner scanner = new Scanner(System.in); // Objek Scanner untuk menerima input dari pengguna

    void cekMenikah() { // Metode untuk memeriksa status menikah
        System.out.print("Masukkan status menikah (Y/N): "); // Mencetak pesan untuk memasukkan status menikah
        cekNikah = scanner.nextLine(); // Memasukkan status menikah dari input pengguna

        if (cekNikah.equals("Y")) { // Memeriksa apakah status menikah adalah "Y" (Yes)
            statusMenikah = true; // Jika "Y", maka status menikah diatur ke true
        } else { // Jika status menikah tidak "Y"
            statusMenikah = false; // Status menikah diatur ke false
        }
    }
}
