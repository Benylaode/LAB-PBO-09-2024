package TugasPraktikum1;

import java.util.Scanner;

public class Tugas1No5 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in); 
    
        // Array 2D yang akan dicari keberadaan suatu bilangan di dalamnya
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean cari = false;  // Variabel penanda untuk menunjukkan apakah bilangan ditemukan

        try {
            // Meminta pengguna untuk memasukkan bilangan yang akan dicari
            System.out.print("Masukkan Bilangan :  ");
            int bil = inputan.nextInt();  // Membaca bilangan dari input pengguna
            inputan.close();  // Menutup scanner

            // Loop untuk mencari bilangan di dalam array 2D
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == bil) {  // Jika bilangan ditemukan
                        System.out.println("Found " + bil + " at nums[" + i + "][" + j + "]");  // Menampilkan lokasi bilangan
                        cari = true;  // Menandai bahwa bilangan ditemukan
                        break;  // Keluar dari loop inner
                    }
                }
                if (cari) {  // Jika bilangan ditemukan, keluar dari loop outer
                    break;
                }
            }
            if (!cari) {  // Jika bilangan tidak ditemukan setelah loop selesai
                System.out.println("Angka Tidak Terdapat Dalam Array. Coba Lagi!");
            }
        } catch (Exception e) {  // Menangkap kesalahan jika input bukan angka
            System.out.println("Terjadi kesalahan. Inputan Harus Berupa Angka atau Angka Berada Dalam Array. Coba Lagi!");
        }
    }
}
