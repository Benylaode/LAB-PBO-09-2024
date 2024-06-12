package TugasPraktikum2.Tugas2No4;

class Mahasiswa {
    String nama;    // Nama mahasiswa
    String nim;     // NIM mahasiswa
    Alamat alamat;  // Objek Alamat yang merepresentasikan alamat mahasiswa
 
    // Getter untuk mendapatkan nama mahasiswa
    String getName() {
        return nama;
    }
 
    // Getter untuk mendapatkan NIM mahasiswa
    String getNIM() {
        return nim;
    }

    // Getter untuk mendapatkan alamat mahasiswa
    String getAlamat() {
        return alamat.getAlamat();  // Memanggil metode getAlamat() dari objek Alamat
    }
}

class Alamat {
    String jalan;  // Nama jalan
    String kota;   // Nama kota

    // Metode untuk menggabungkan jalan dan kota menjadi alamat lengkap
    String getAlamat() {
        return jalan + ", " + kota;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Alamat
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;  // Mengatur alamat mahasiswa
        mahasiswa.nama = "Ilham Kurniawan";  // Mengatur nama mahasiswa
        mahasiswa.nim = "H071231024";        // Mengatur NIM mahasiswa

        // Menampilkan informasi tentang mahasiswa
        System.out.println("=======================================");
        System.out.println("Nama   : " + mahasiswa.getName());
        System.out.println("NIM    : " + mahasiswa.getNIM());
        System.out.println("Alamat : " + mahasiswa.getAlamat());
        System.out.println("=======================================");
    }
}
