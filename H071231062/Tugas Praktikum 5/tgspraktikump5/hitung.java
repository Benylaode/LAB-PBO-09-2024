package tgspraktikump5;

import java.util.Scanner;

class BangunRuang {
    String nama;
    double luas;
    double volume;
    Scanner scanner = new Scanner(System.in);

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    void displayRuang() {
        System.out.println("--------------------------------");
        System.out.println("Area: " +nama + " : " + luas);
        System.out.println("Volume : " + nama +" : " + volume);
        System.out.println("--------------------------------");
    }
}

class Kubus extends BangunRuang {
    double sideLength;
    

    public Kubus(String nama, double sideLength) {
        super(nama);
        this.sideLength = sideLength;
    }

    public Kubus() {
        super("Kubus");
    }

    void hitungBangun() {
        System.out.print("Masukkan panjang sisi: ");
        // sideLength = scanner.nextDouble();
        luas = 6 * Math.pow(sideLength, 2);
        volume = Math.pow(sideLength, 3);
    }
}

class Balok extends BangunRuang {
    public Balok(String nama, double length, double width, double height) {
        super(nama);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double length, width, height;

    public Balok() {
        super("Balok");
    }

    void hitungBangun() {
        System.out.print("Masukkan panjang: ");
        // length = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        // width = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        // height = scanner.nextDouble();
        luas = 2 * (length * width + length * height + width * height);
        volume = length * width * height;
    }
}

class Bola extends BangunRuang {
    public Bola(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

    double radius;

    public Bola() {
        super("Bola");
    }

    void hitungBangun() {
        System.out.print("Masukkan radius: ");
        // radius = scanner.nextDouble();
        luas = 4 * Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Tabung extends BangunRuang {
    public Tabung(String nama, double radius, double height) {
        super(nama);
        this.radius = radius;
        this.height = height;
    }

    double radius, height;

    public Tabung() {
        super("Tabung");
    }

    void hitungBangun() {
        System.out.print("Masukkan radius: ");
        // radius = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        // height = scanner.nextDouble();
        luas = 2 * Math.PI * radius * (radius + height);
        volume = Math.PI * Math.pow(radius, 2) * height;
    }
}

class BangunDatar {
    String nama;
    double luas;
    double Keliling;
    Scanner scanner = new Scanner(System.in);

    public BangunDatar(String nama) {
        this.nama = nama;
    }


    void display() {
        System.out.println("--------------------------------");
        System.out.println("Luas" + nama +" : "+luas);
        System.out.println("keliling  "+ nama +" : " + Keliling);
        System.out.println("--------------------------------");
    }
}

class Persegi extends BangunDatar {
    public Persegi(String nama, double sideLength) {
        super(nama);
        this.sideLength = sideLength;
    }

    double sideLength;

    public Persegi() {
        super("Persegi");
    }

    void hitungBangun() {
        System.out.print("Masukkan panjang sisi: ");
        // sideLength = scanner.nextDouble();
        luas = Math.pow(sideLength, 2);
        Keliling = 4 * sideLength;
    }
}

class PersegiPanjang extends BangunDatar {
    double length, width;

    public PersegiPanjang(String nama, double length, double width) {
        super(nama);
        this.length = length;
        this.width = width;
    }

    public PersegiPanjang() {
        super("Persegi Panjang");
    }

    void hitungBangun() {
        System.out.print("Masukkan panjang: ");
        // length = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        // width = scanner.nextDouble();
        luas = length * width;
        Keliling = 2 * (length + width);
    }
}

class Lingkaran extends BangunDatar {
    public Lingkaran(String nama) {
        super(nama);
    }

    double radius;

    public Lingkaran() {
        super("Lingkaran");
    }

    void hitungBangun() {
        System.out.print("Masukkan radius: ");
        radius = scanner.nextDouble();
        luas = Math.PI * Math.pow(radius, 2);
        Keliling = 2 * Math.PI * radius;
    }
}

class Trapesium extends BangunDatar {
    double side1, side2, side3, side4, height;

    public Trapesium(String nama, double side1, double side2, double side3, double side4, double height) {
        super(nama);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.height = height;
    }

    public Trapesium() {
        super("Trapesium");
    }

    void hitungBangun() {
        System.out.print("Masukkan sisi 1 trapesium: ");
        // side1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2 trapesium: ");
        // side2 = scanner.nextDouble();
        System.out.print("Masukkan sisi 3 trapesium: ");
        // side3 = scanner.nextDouble();
        System.out.print("Masukkan sisi 4 trapesium: ");
        // side4 = scanner.nextDouble();
        System.out.print("Masukkan tinggi : ");
        // height = scanner.nextDouble();
        luas = 0.5 * (side1 + side3) * height;
        Keliling = side1 + side2 + side3 + side4;
    }
}

public class hitung{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        boolean exit = false;

        while (!exit) {
            System.out.println("====== BANGUN RUANG ======");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG ");
            System.out.println("====== BANGUN DATAR ======");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("9. Keluar");
            garis();
            

            System.out.print("Pilihan : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                double sideLength = scanner.nextDouble();
                    Kubus kbs = new Kubus("kubus", sideLength);
                    
                    kbs.hitungBangun();
                    kbs.displayRuang();
                    break;
                case 2:
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                    Balok blk = new Balok("balok", length, width, height);
                    blk.hitungBangun();
                    blk.displayRuang();
                    break;
                case 3:
                double radius = scanner.nextDouble();

                    Bola bola = new Bola("bola",radius);
                    bola.hitungBangun();
                    bola.displayRuang();
                    break;
                case 4:
                double Radius = scanner.nextDouble();
                double Height = scanner.nextDouble();
                    Tabung tbg = new Tabung("tabung", Radius,Height);
                    tbg.hitungBangun();
                    tbg.displayRuang();
                    break;
                case 5:
                double SideLength = scanner.nextDouble();
                    Persegi prsg = new Persegi("persegi",SideLength);
                    prsg.hitungBangun();
                    prsg.display();
                    break;
                case 6:
                double Length = scanner.nextDouble();
                double Width = scanner.nextDouble();
                    PersegiPanjang prsgpnjg = new PersegiPanjang("persegipnjg",Length, Width);
                    prsgpnjg.hitungBangun();
                    prsgpnjg.display();
                    break;
                case 7:
                
                    Lingkaran lngkrn = new Lingkaran("lingkaran");
                    lngkrn.hitungBangun();
                    lngkrn.display();
                    break;
                case 8:
                    Double side1 = scanner.nextDouble();
                    Double side2 = scanner.nextDouble();
                    Double side3 = scanner.nextDouble();
                    Double side4 = scanner.nextDouble();
                    Double height1 = scanner.nextDouble();
                   
        
                    Trapesium trpsm = new Trapesium("trapesium",side1,side2,side3,side4,height1);
                    trpsm.hitungBangun();
                    trpsm.display();
                    break;
                case 9:
                    System.out.println("CLOSING PROGRAM");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
    }

    static void garis() {
        System.out.println("===========================");
    }
}
