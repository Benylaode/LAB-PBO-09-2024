package TugasPraktikum2.Tugas2No3;

class Cuboid { 
    double height;  // Tinggi kuboid
    double widht;   // Lebar kuboid
    double length;  // Panjang kuboid

    // Method untuk menghitung volume kuboid
    double getVolume() {
        return this.length * this.widht * this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();  // Membuat objek kuboid baru

        // Mengatur nilai tinggi, lebar, dan panjang kuboid
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.length = 30;

        // Menampilkan hasil volume kuboid
        System.out.println("======================");
        System.out.printf("Volume = %.2f\n", cuboid.getVolume());  // Menampilkan volume kuboid dengan dua angka di belakang koma
        System.out.println("======================");
    }
}
