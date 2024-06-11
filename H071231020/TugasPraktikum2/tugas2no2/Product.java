package TugasPraktikum2.Tugas2No2;

public class Product {

    String nama;    // Nama produk
    int ID;         // ID produk
    double harga;   // Harga produk
    int stok;       // Stok produk

    // Konstruktor untuk inisialisasi atribut produk
    Product(String nama, int ID, double harga, int stok) {
        this.nama = nama;
        this.ID = ID;
        this.harga = harga;
        // Jika stok kurang dari atau sama dengan 0, stok diatur menjadi 0, jika tidak, stok tetap sesuai input
        this.stok = stok <= 0 ? 0 : stok;
    }

    // Setter untuk mengatur nama produk
    void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mendapatkan nama produk
    String getName() {
        return nama;
    }
    
    // Setter untuk mengatur ID produk
    void setID(int ID) {
        this.ID = ID;
    }

    // Getter untuk mendapatkan ID produk
    int getID() {
        return ID;
    }

    // Setter untuk mengatur harga produk
    void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter untuk mendapatkan harga produk
    double getHarga() {
        return harga;
    }

    // Metode untuk mengubah format harga menjadi format yang sesuai
    String formatHarga(double harga) {
        // Mengubah format harga menjadi format yang memisahkan ribuan dengan titik
        String fHarga = String.format("%,.0f", harga);
        return fHarga.replace(",", ".");  // Mengganti tanda koma dengan titik
    }

    // Setter untuk mengatur stok produk
    void setStok(int stok) {
        // Jika stok kurang dari atau sama dengan 0, stok diatur menjadi 0, jika tidak, stok tetap sesuai input
        this.stok = stok <= 0 ? 0 : stok;
    }

    // Getter untuk mendapatkan stok produk
    int getStok() {
        return stok;
    }

    // Metode untuk memeriksa apakah produk tersedia atau tidak
    boolean isTersedia() {
        return stok > 0;  // Mengembalikan true jika stok lebih besar dari 0, false jika tidak
    }

    // Metode untuk menampilkan informasi tentang produk
    void infoProduk() {
        // Menampilkan informasi produk seperti nama, ID, harga, dan stok
        System.out.println("========================================");
        System.out.println("Nama Produk  : " + nama);
        System.out.println("ID Produk    : " + ID);
        System.out.println("Harga Produk : " + formatHarga(harga));  // Menggunakan formatHarga untuk menampilkan harga yang sudah diformat
        System.out.println("Stock Produk : " + stok);
        System.out.println("========================================");
        
        // Menampilkan pesan mengenai ketersediaan stok
        if(isTersedia()) {
            System.out.println(stok + " STOK PRODUK TERSEDIA!");
        } else {
            System.out.println("STOK PRODUK TIDAK TERSEDIA!");
        }
        System.out.println("========================================");

    }

    // Metode main untuk pengujian sederhana
    public static void main(String[] args) {
        // Membuat objek produk baru dengan menggunakan konstruktor
        Product laptop = new Product("ASUS ROG Strix G16 (G614)", 7, 42000000, -1);

        // Menampilkan informasi tentang produk
        laptop.infoProduk();
    }
}
