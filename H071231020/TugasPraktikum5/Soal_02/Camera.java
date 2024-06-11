package Soal_02;

class Camera extends Product {
    private int resolution; // Resolusi kamera
    private String lensType; // Jenis lensa

    // Konstruktor untuk kelas Camera
    Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price); // Memanggil konstruktor superclass (Product)
        this.resolution = resolution; // Inisialisasi resolusi kamera
        this.lensType = lensType; // Inisialisasi jenis lensa
    }

    // Metode untuk menampilkan informasi kamera
    @Override
    void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass
        System.out.println("Resolution: " + this.resolution); // Menampilkan resolusi kamera
        System.out.println("Lens Type: " + this.lensType); // Menampilkan jenis lensa
    }
}
