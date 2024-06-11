package Soal_02;

class Laptop extends Product {
    private int ramSize; // Ukuran RAM
    private String processorType; // Jenis prosesor

    // Konstruktor untuk kelas Laptop
    Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price); // Memanggil konstruktor superclass (Product)
        this.ramSize = ramSize; // Inisialisasi ukuran RAM
        this.processorType = processorType; // Inisialisasi jenis prosesor
    }

    // Metode untuk menampilkan informasi laptop
    @Override
    void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass
        System.out.println("Ram size: " + this.ramSize); // Menampilkan ukuran RAM
        System.out.println("Processor type: " + this.processorType); // Menampilkan jenis prosesor
    }
}
