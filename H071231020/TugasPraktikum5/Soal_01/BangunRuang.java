package Soal_01;

import java.util.Scanner;

// Kelas induk yang mewakili bentuk geometris generik
class BangunRuang {
    double luasPermukaan; // Luas permukaan bangun ruang
    double volume; // Volume bangun ruang
    Scanner sc = new Scanner(System.in); // Objek Scanner untuk masukan pengguna

    // Metode untuk menampilkan luas permukaan dan volume bangun ruang
    void showLuasVolume() {
        System.out.println("Luas Permukaan : " + luasPermukaan); // Menampilkan luas permukaan
        System.out.println("Volume : " + volume); // Menampilkan volume
    }
}

// Kelas turunan yang mewakili kubus, mewarisi dari BangunRuang
class Kubus extends BangunRuang {
    // Metode untuk menghitung dan menampilkan luas permukaan serta volume kubus
    void showLuasVolumeKubus() {
        System.out.print("Masukkan sisi kubus : "); // Meminta pengguna untuk memasukkan panjang sisi kubus
        double sisi = sc.nextDouble(); // Membaca masukan dari pengguna

        super.luasPermukaan = 6 * sisi * sisi; // Menghitung luas permukaan kubus
        super.volume = sisi * sisi * sisi; // Menghitung volume kubus
    }
}

// Kelas turunan yang mewakili balok, mewarisi dari BangunRuang
class Balok extends BangunRuang {
    // Metode untuk menghitung dan menampilkan luas permukaan serta volume balok
    void showLuasVolumeBalok() {
        System.out.print("Masukkan Panjang : "); // Meminta pengguna untuk memasukkan panjang
        double panjang = sc.nextDouble(); // Membaca masukan dari pengguna
        sc.nextLine(); // Mengonsumsi karakter baris baru

        System.out.println("Masukkan Lebar : "); // Meminta pengguna untuk memasukkan lebar
        double lebar = sc.nextDouble(); // Membaca masukan dari pengguna
        sc.nextLine(); // Mengonsumsi karakter baris baru

        System.out.println("Masukkan Tinggi : "); // Meminta pengguna untuk memasukkan tinggi
        double tinggi = sc.nextDouble(); // Membaca masukan dari pengguna

        super.luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (tinggi * lebar)); // Menghitung luas permukaan balok
        super.volume = panjang * lebar * tinggi; // Menghitung volume balok
    }
}
// Kelas turunan yang mewakili bola, mewarisi dari BangunRuang
class Bola extends BangunRuang {
    // Metode untuk menghitung dan menampilkan luas permukaan serta volume bola
    void showLuasVolumeBola() {
        System.out.println("Pilih yang diketahui : ");
        System.out.println("1. Jari-jari \n2. Diameter");
        System.out.println("> ");
        int pilih = sc.nextInt();
        sc.nextLine();
        while (true) {
            if (pilih == 1) {
                System.out.print("Masukkan jari-jari : ");
                double jariJari = sc.nextDouble();
                super.luasPermukaan = 4 * 3.14 * jariJari * jariJari; // Menghitung luas permukaan bola
                super.volume = (4 * (3.14 * jariJari * jariJari * jariJari)) / 3; // Menghitung volume bola
                break;
            } else if (pilih == 2) {
                System.out.print("Masukkan diameter : ");
                double diameter = sc.nextDouble();
                double j = diameter / 2;
                super.luasPermukaan = 4 * 3.14 * j * j; // Menghitung luas permukaan bola
                super.volume = (4 * (3.14 * j * j * j)) / 3; // Menghitung volume bola
                break;
            } else {
                System.out.println("Tidak ada di menu pilihan");
            }
        }
    }
}

// Kelas turunan yang mewakili tabung, mewarisi dari BangunRuang
class Tabung extends BangunRuang {
    // Metode untuk menghitung dan menampilkan luas permukaan serta volume tabung
    void showLuasVolumeTabung() {
        System.out.println("Pilih yang diketahui : ");
        System.out.println("1. Jari-jari \n2. Diameter");
        System.out.println("> ");
        int pilih = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan tinggi : ");
        double tinggi = sc.nextDouble();
        sc.nextLine();

        while (true) {
            if (pilih == 1) {
                System.out.print("Masukkan jari-jari : ");
                double jariJari = sc.nextDouble();
                super.luasPermukaan = 2 * 3.14 * jariJari * (jariJari + tinggi); // Menghitung luas permukaan tabung
                super.volume = 3.14 * (jariJari * jariJari) * tinggi; // Menghitung volume tabung
                break;
            } else if (pilih == 2) {
                System.out.print("Masukkan diameter : ");
                double diameter = sc.nextDouble();
                double j = diameter / 2;
                super.luasPermukaan = 2 * 3.14 * j * (j + tinggi); // Menghitung luas permukaan tabung
                super.volume = 3.14 * (j * j) * tinggi; // Menghitung volume tabung
                break;
            } else {
                System.out.println("Tidak ada di menu pilihan");
            }
        }
    }
}
