package soal1;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }
    private static void runApp(){
        System.out.println("-------------------------");
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println("===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("-------------------------");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        System.out.println("-------------------------");

        sc.nextLine();
        switch (pilihan) {
            case 1:
                Kubus();
                break;
            case 2:
                Balok();
                break;
            case 3:
                Bola();
                break;
            case 4:
                Tabung();
                break;
            case 5:
                Persegi();
                break;
            case 6:
                PersegiPanjang();
                break;
            case 7:
                Lingkaran();
                break;
            case 8:
                Trapesium();
                break;
            default :
                runApp();
        }
    }
    private static void Kubus() {
        Kubus kubus = new Kubus();
        double sisi;
        System.out.print("Masukkan sisi : ");
        sisi = sc.nextDouble();
        System.out.println("Luas: " + kubus.luas(sisi));
        System.out.println("Volume: " + kubus.volume(sisi));
        System.out.println("-------------------------");

    }
    private static void Balok() {
        Balok balok = new Balok();
        double p,l,t;
        System.out.print("Masukkan sisi : ");
        p = sc.nextDouble();
        System.out.print("Masukkan sisi : ");
        l = sc.nextDouble();
        System.out.print("Masukkan sisi : ");
        t = sc.nextDouble();
        System.out.println("Volume: " + balok.volume(p,l,t));
        System.out.println("Luas: " + balok.luas(p,l,t));
        System.out.println("-------------------------");

    }
    private static void Bola() {
        Bola bola = new Bola();
        double sisi;
        System.out.print("Masukkan rusuk : ");
        sisi = sc.nextDouble();
        System.out.printf("Luas: %.2f\n" , bola.luas(sisi));
        System.out.printf("Volume: %.2f\n" , bola.volume(sisi));
        System.out.println("-------------------------");
 
    }
    private static void Tabung() {
        Tabung tabung = new Tabung();
        double sisi,t;
        System.out.print("Masukkan rusuk : ");
        sisi = sc.nextDouble();
        System.out.print("Masukkan sisi : ");
        t = sc.nextDouble();
        System.out.println("Volume: " + tabung.volume(sisi,t));
        System.out.println("Luas: " + tabung.luas(sisi,t));
        System.out.println("-------------------------");
    }
    private static void Persegi() {
        Persegi persegi = new Persegi();
        double sisi;
        System.out.print("Masukkan sisi : ");
        sisi = sc.nextDouble();
        System.out.println("Luas: " + persegi.luas(sisi, sisi));
        System.out.println("Keliling: " + persegi.Keliling(sisi));
        System.out.println("-------------------------");
    }
    private static void PersegiPanjang() {
        PersegiPanjang PersegiPanjang = new PersegiPanjang();
        double p,l;
        System.out.print("Masukkan sisi : ");
        p = sc.nextDouble();
        System.out.print("Masukkan sisi : ");
        l = sc.nextDouble();
        System.out.println("Luas: " + PersegiPanjang.luas(p,l));
        System.out.println("Keliling: " + PersegiPanjang.Keliling(p,l));
        System.out.println("-------------------------");
    }
    private static void Lingkaran() {
        Lingkaran l = new Lingkaran();
        double sisi;
        System.out.print("Masukkan rusuk : ");
        sisi = sc.nextDouble();
        System.out.println("Luas: " + l.luas(sisi));
        System.out.println("Keliling: " + l.keliling(sisi));
        System.out.println("-------------------------");
    }
    private static void Trapesium() {
        Trapesium trapesium = new Trapesium();
        double sisi1, sisi2, sisi3, sisi4, t;
        System.out.print("Masukkan sisi 1: ");
        sisi1 = sc.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        sisi2 = sc.nextDouble();
        System.out.print("Masukkan sisi 3:");
        sisi3  = sc.nextDouble();
        System.out.print("Masukkan sisi 4: ");
        sisi4 = sc.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = sc.nextDouble();
        System.out.println("Luas: " + trapesium.luas(sisi1,sisi2,t));
        System.out.println("keliling: " + trapesium.keliling(sisi1,sisi2,sisi3,sisi4));
        System.out.println("-------------------------");
    }
}
