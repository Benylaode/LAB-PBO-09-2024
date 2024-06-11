package TugasPraktikum1;
import java.util.Scanner;

public class Tugas1No4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        double r, luas; 
        try {
            // Meminta pengguna untuk memasukkan jari-jari lingkaran
            System.out.print("Masukkan Jari-Jari Lingkaran : ");
            r = inputan.nextDouble();  // Membaca jari-jari lingkaran dari input pengguna
            inputan.close();  // Menutup scanner

        } catch (Exception e) {
            // Menangani kesalahan jika input bukan angka
            System.out.println("Input Harus Berupa Angka. Coba Lagi!");
            return;  // Keluar dari program
        }
            
        // Menghitung luas lingkaran
        luas = Math.PI * r * r;
        
        // Menampilkan hasil luas lingkaran dengan dua angka di belakang koma
        System.out.printf("Luas Lingkaran : %.2f\n", luas);
    }   
}
