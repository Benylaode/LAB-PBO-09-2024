package TugasPraktikum1;
import java.util.Scanner;

public class Tugas1No1 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner inputan = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah bilangan yang akan diinput
        System.out.print("Masukkan Jumlah Bilangan : ");
        int n = inputan.nextInt();  // Membaca jumlah bilangan
        inputan.nextLine();  // Membaca karakter newline setelah input integer

        // Inisialisasi variabel untuk menghitung bilangan bulat dan bilangan desimal
        int Bil_Bulat = 0;
        int Bil_Desimal = 0;

        // Meminta pengguna untuk memasukkan n bilangan
        System.out.print("Masukkan " + n + " Bilangan : ");
        String bilangan = inputan.nextLine();  // Membaca seluruh baris input bilangan
        String[] angka = bilangan.split(" ");  // Memisahkan bilangan berdasarkan spasi

        inputan.close();  // Menutup scanner

        // Loop untuk memproses setiap bilangan yang telah dipisahkan
        for (String angkaBaru : angka) {
            try {
                // Mengubah string menjadi double
                double ang = Double.parseDouble(angkaBaru);
                // Mengecek apakah bilangan tersebut adalah bilangan bulat
                if (ang == (int) ang) {
                    Bil_Bulat++;   // Jika bilangan bulat, tambahkan ke hitungan bilangan bulat
                } else {
                    Bil_Desimal++;  // Jika bilangan desimal, tambahkan ke hitungan bilangan desimal
                }
            } catch (Exception e) {
                // Jika terjadi kesalahan (misalnya input bukan angka), tampilkan pesan error
                System.out.println("Input Harus Berupa Angka. Coba Lagi!");
                return;  // Keluar dari program
            }
        }
        
        // Menampilkan hasil perhitungan jumlah bilangan bulat dan bilangan desimal
        System.out.println("\nTerdapat " + Bil_Bulat + " Bilangan Bulat" );
        System.out.println("Terdapat " + Bil_Desimal + " Bilangan Desimal" );
    }
}
