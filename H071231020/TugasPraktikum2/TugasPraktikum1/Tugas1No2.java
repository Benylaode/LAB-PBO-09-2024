package TugasPraktikum1;
import java.util.Scanner;

public class Tugas1No2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan judul film
        System.out.print("Masukkan Judul Film : ");
        String kalimat = inputan.nextLine();  // Membaca judul film dari input pengguna
        inputan.close();  // Menutup scanner
        
        // Memisahkan kalimat menjadi array kata-kata
        String[] Arr_Kata = kalimat.split(" ");
        
        // Loop untuk memanggil fungsi kapHurufPertama() untuk setiap kata dalam array
        for (int i = 0; i < Arr_Kata.length; i++) {
            Arr_Kata[i] = kapHurufPertama(Arr_Kata[i]);  // Mengubah huruf pertama kata menjadi kapital
        }
        
        // Menggabungkan array kata-kata kembali menjadi satu kalimat
        String output = String.join(" ", Arr_Kata);
        
        // Menampilkan hasil kalimat dengan huruf pertama setiap kata menjadi kapital
        System.out.println("Hasil: " + output);
    }
    
    // Fungsi untuk mengubah huruf pertama suatu kata menjadi kapital
    public static String kapHurufPertama(String kata) {
        if (kata == null || kata.isEmpty()) {
            return kata;  // Jika kata kosong atau null, kembalikan kata tersebut
        }
        return Character.toUpperCase(kata.charAt(0)) + kata.substring(1).toLowerCase();  // Mengubah huruf pertama menjadi kapital
    }
}
