import java.util.InputMismatchException;
import java.util.Scanner;

public class Karyawan {
    String nama; // Deklarasi variabel untuk menyimpan nama karyawan
    int umur; // Deklarasi variabel untuk menyimpan umur karyawan
    String jabatan; // Deklarasi variabel untuk menyimpan jabatan karyawan
    int gaji; // Deklarasi variabel untuk menyimpan gaji karyawan
    boolean validasi = true; // Variabel untuk mengecek validasi input
    Scanner scanner = new Scanner(System.in); // Objek Scanner untuk menerima input dari pengguna

    public String getNama() { // Metode untuk mengembalikan nama karyawan
        return nama;
    }

    public void setNama(String nama) { // Metode untuk mengatur nama karyawan
        this.nama = nama;
    }

    public int getUmur() { // Metode untuk mengembalikan umur karyawan
        return umur;
    }

    public void setUmur(int umur) { // Metode untuk mengatur umur karyawan
        this.umur = umur;
    }

    public String getJabatan() { // Metode untuk mengembalikan jabatan karyawan
        return jabatan;
    }

    public void setJabatan(String jabatan) { // Metode untuk mengatur jabatan karyawan
        this.jabatan = jabatan;
    }

    public int getGaji() { // Metode untuk mengembalikan gaji karyawan
        return gaji;
    }

    public void setGaji(int gaji) { // Metode untuk mengatur gaji karyawan
        this.gaji = gaji;
    }

    void detailKaryawan() { // Metode untuk memasukkan detail karyawan
        System.out.print("Masukkan nama:"); // Mencetak pesan untuk memasukkan nama karyawan
        nama = scanner.nextLine(); // Memasukkan nama karyawan dari input pengguna
        while (validasi) { // Looping untuk validasi input
            try { // Blok try untuk menangani InputMismatchException
                System.out.print("Masukkan umur:"); // Mencetak pesan untuk memasukkan umur karyawan
                umur = scanner.nextInt(); // Memasukkan umur karyawan dari input pengguna
                scanner.nextLine(); // Membuang karakter baru setelah input umur
                validasi = false; // Mengubah status validasi menjadi false untuk keluar dari loop
            } catch (InputMismatchException e) { // Menangkap InputMismatchException
                System.out.println("Input tidak valid."); // Mencetak pesan kesalahan untuk input yang tidak valid
                scanner.nextLine(); // Membersihkan buffer scanner
                validasi = true; // Mengubah status validasi menjadi true agar pengguna diminta untuk memasukkan input kembali
            }
        }
    }
}
