package Soal_02;

// Deklarasi kelas Smartphone yang merupakan subkelas dari kelas Product
class Smartphone extends Product {
    // Atribut privat untuk menyimpan ukuran layar smartphone dalam inci
    private double screenSize;
    // Atribut privat untuk menyimpan kapasitas penyimpanan smartphone dalam gigabyte (GB)
    private int storageCapacity;

    // Konstruktor untuk membuat objek Smartphone dengan parameter merek, nomor seri, harga, ukuran layar, dan kapasitas penyimpanan
    Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        // Memanggil konstruktor superclass untuk menginisialisasi atribut merek, nomor seri, dan harga
        super(brand, seriesNumber, price);
        // Menginisialisasi atribut ukuran layar dengan nilai yang diberikan
        this.screenSize = screenSize;
        // Menginisialisasi atribut kapasitas penyimpanan dengan nilai yang diberikan
        this.storageCapacity = storageCapacity;
    }

    // Override metode displayInfo() dari kelas Product untuk menampilkan informasi tentang smartphone
    @Override
    void displayInfo() {
        // Memanggil metode displayInfo() dari superclass untuk menampilkan informasi umum produk
        super.displayInfo();
        // Menampilkan informasi ukuran layar smartphone
        System.out.println("Screen size: " + this.screenSize);
        // Menampilkan informasi kapasitas penyimpanan smartphone
        System.out.println("Storage capacity: " + this.storageCapacity);
    }
}
