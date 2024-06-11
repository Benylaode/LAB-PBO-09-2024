package Soal_01;

import java.util.Scanner;

// Kelas induk untuk bentuk geometri
class BangunDatar {
    protected double luas; // Luas
    protected double keliling; // Keliling

    Scanner input = new Scanner(System.in);

    // Metode untuk menampilkan luas dan keliling
    void showLuasKeliling() {
        System.out.println("Luas     : " + luas); // Menampilkan luas
        System.out.println("Keliling : " + keliling); // Menampilkan keliling
    }
}

// Subkelas yang mewakili persegi
class Persegi extends BangunDatar {
    protected double sisi; // Panjang sisi

    // Konstruktor untuk menghitung luas dan keliling persegi
    public Persegi(double sisi) {
        super.luas = sisi * sisi; // Menghitung luas
        super.keliling = 4 * sisi; // Menghitung keliling
    }
}

// Subkelas yang mewakili persegi panjang
class PersegiPanjang extends BangunDatar {
    protected double sisi_panjang, sisi_lebar; // Panjang dan lebar

    // Konstruktor untuk menghitung luas dan keliling persegi panjang
    public PersegiPanjang(double sisi_panjang, double sisi_lebar) {
        super.luas = sisi_panjang * sisi_lebar; // Menghitung luas
        super.keliling = 2 * (sisi_panjang * sisi_lebar); // Menghitung keliling
    }
}

// Subkelas yang mewakili lingkaran
class Lingkaran extends BangunDatar {
    double jariJari; // Jari-jari
    double diameter; // Diameter

    // Konstruktor untuk menghitung luas dan keliling lingkaran berdasarkan jari-jari
    public Lingkaran(double jariJari) {
        super.luas = 3.14 * jariJari * jariJari; // Menghitung luas
        super.keliling = 2 * 3.14 * jariJari; // Menghitung keliling
    }

    // Konstruktor untuk menghitung luas dan keliling lingkaran berdasarkan diameter
    public Lingkaran(double diameter, String s) {
        super.luas = 3.14 * (diameter / 2); // Menghitung luas
        super.keliling = 3.14 * diameter; // Menghitung keliling
    }
}

// Subkelas yang mewakili trapesium
class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4, tinggi; // Sisi-sisi dan tinggi

    // Konstruktor untuk menghitung luas dan keliling trapesium
    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        super.luas = ((sisi1 + sisi2) * tinggi) / 2; // Menghitung luas
        super.keliling = sisi1 + sisi2 + sisi3 + sisi4; // Menghitung keliling
    }
}
