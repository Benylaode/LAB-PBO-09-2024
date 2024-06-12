package Soal_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("=======BANGUN RUANG=======");
        System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG ");

        System.out.println("=======BANGUN DATAR=======");
        System.out.println("5. PERSEGI \n6. PERSEGI PANJANG \n7. LINGKARAN \n8. TRAPESIUM ");
        System.out.println("----------------------------------------");
        System.out.print("Pilihan : ");
        int pilih = s.nextInt();
        s.nextLine();
        if (pilih == 1) {
            Kubus kubus = new Kubus();
            kubus.showLuasVolumeKubus();
            kubus.showLuasVolume();
        } else if (pilih == 2) {
            Balok balok = new Balok();
            balok.showLuasVolumeBalok();
            balok.showLuasVolume();
        } else if (pilih == 3) {
            Bola bola = new Bola();
            bola.showLuasVolumeBola();
            bola.showLuasVolume();
        } else if (pilih == 4) {
            Tabung tabung = new Tabung();
            tabung.showLuasVolumeTabung();
            tabung.showLuasVolume();
        } else if (pilih == 5) {
            // Meminta pengguna memasukkan sisi persegi
            System.out.print("Masukkan sisi: ");
            double sisi = s.nextDouble();
            // Membuat objek Persegi dengan sisi yang diberikan
            Persegi persegi = new Persegi(sisi);
            // Menampilkan luas dan keliling persegi
            persegi.showLuasKeliling();
        } else if (pilih == 6) {
            // Meminta pengguna memasukkan panjang dan lebar persegi panjang
            System.out.print("Masukkan sisi panjang: ");
            double panjang = s.nextDouble();
            System.out.print("Masukkan sisi lebar: ");
            double lebar = s.nextDouble();
            // Membuat objek PersegiPanjang dengan panjang dan lebar yang diberikan
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            // Menampilkan luas dan keliling persegi panjang
            persegiPanjang.showLuasKeliling();
        } else if (pilih == 7) {
            // Meminta pengguna memilih apakah akan memasukkan jari-jari atau diameter lingkaran
            System.out.println("Pilih yang diketahui : ");
            System.out.println("1. Jari-jari \n2. Diameter");
            System.out.println("> ");
            int pilih_lingkaran = s.nextInt();
            s.nextLine();
            while (true) {
                if (pilih_lingkaran == 1) {
                    // Meminta pengguna memasukkan jari-jari
                    System.out.print("Masukkan jari-jari : ");
                    double jariJari = s.nextDouble();
                    // Membuat objek Lingkaran dengan jari-jari yang diberikan
                    Lingkaran lingkaran = new Lingkaran(jariJari);
                    // Menampilkan luas dan keliling lingkaran
                    lingkaran.showLuasKeliling();
                    break;
                } else if (pilih_lingkaran == 2) {
                    // Meminta pengguna memasukkan diameter
                    System.out.println("Masukkan diameter : ");
                    double diameter = s.nextDouble();
                    // Membuat objek Lingkaran dengan diameter yang diberikan
                    Lingkaran lingkaran = new Lingkaran(diameter, null);
                    // Menampilkan luas dan keliling lingkaran
                    lingkaran.showLuasKeliling();
                    break;
                } else {
                    System.out.println("Tidak ada di menu pilihan");
                }
            }
        } else if (pilih == 8) {
            // Meminta pengguna memasukkan panjang sisi trapesium dan tinggi trapesium
            System.out.print("Masukkkan sisi 1 trapesium: ");
            double sisi1 = s.nextDouble();
            System.out.print("Masukkkan sisi 2 trapesium: ");
            double sisi2 = s.nextDouble();
            System.out.print("Masukkkan sisi 3 trapesium: ");
            double sisi3 = s.nextDouble();
            System.out.print("Masukkkan sisi 4 trapesium: ");
            double sisi4 = s.nextDouble();

            System.out.print("Masukkan tinggi trapesium: ");
            double tinggi = s.nextDouble();

            // Membuat objek Trapesium dengan sisi-sisi dan tinggi yang diberikan
            Trapesium trapesium = new Trapesium(sisi1, sisi2, sisi3, sisi4, tinggi);
            // Menampilkan luas dan keliling trapesium
            trapesium.showLuasKeliling();

        } else {
            System.out.println("Tidak ada di menu pilihan");
        }

    }
}
