import java.util.Scanner;

class BangunDatar {
    double sisi;
    double tinggi;
    double jumlahSisi;
    
    double luas(double sisi, double tinggi) {
        return sisi * tinggi;
    }

    double keliling(double sisi1, double sisi2, double sisi3, double sisi4) {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}

class BangunRuang {
    double volume(double la, double tinggi) {
        return la * tinggi;
    }

    double luasPermukaan(double la, double lp, double ls) {
        return la + lp + ls;
    }
}

class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double volume() {
        double la = sisi * sisi;
        return super.volume(la, sisi);
    }

    double luasPermukaan() {
        double la = sisi * sisi;
        double ls = sisi * sisi * 4;
        return super.luasPermukaan(la, la, ls);
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double volume() {
        double la = panjang * lebar * tinggi; // Rumus volume sesuai dengan panjang * lebar * tinggi
        return super.volume(la, 1); // Menggunakan tinggi sementara di sini, tidak masalah karena tidak dipakai dalam perhitungan volume
    }    

    double luasPermukaan() {
        double la = 2 * (panjang * lebar);
        double lp = 2 * (panjang * tinggi);
        double ls = 2 * (lebar * tinggi);
        return super.luasPermukaan(la, lp, ls);
    }
}

class Bola extends BangunRuang {
    double radius;

    Bola(double radius) {
        this.radius = radius;
    }

    double volume() {
        double la = 2.0/3.0 * (radius * radius * Math.PI);
        double tinggi = 2 * radius; 
        return super.volume(la, tinggi);
    }

    double luasPermukaan() {
        double la = radius * radius * Math.PI;
        double lp = radius * radius * Math.PI;
        double ls = 2 * la;
        return super.luasPermukaan(la, lp, ls);
    }
}

class Tabung extends BangunRuang {
    double radius, tinggi;

    Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    double volume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    double luasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double luas() {
        double tinggi = this.sisi;
        return super.luas(sisi, tinggi);
    }

    double keliling() {
        return super.keliling(sisi, sisi, sisi, sisi);
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double luas() {
       double tinggi = panjang;
       double sisi = lebar;
       return super.luas(sisi, tinggi);
    
    }

    double keliling() {
        return super.keliling(panjang, lebar, panjang, lebar);
    }
}

class Lingkaran extends BangunDatar {
    double radius;

    Lingkaran(double radius) {
        this.radius = radius;
    }

    double luas() {
        double sisi = radius;
        double tinggi = Math.PI * radius;
        return super.luas(sisi, tinggi);
    }

    double keliling() {
        double sisi = 0.5 * Math.PI * radius;
        return super.keliling(sisi, sisi, sisi, sisi);
    }
}

class Trapesium extends BangunDatar {
    double atas, bawah, tinggi, sisiMiring1, sisiMiring2;

    Trapesium(double atas, double bawah, double tinggi, double sisiMiring1, double sisiMiring2) {
        this.atas = atas;
        this.bawah = bawah;

        this.tinggi = tinggi;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    double luas() {
        double sisi = 0.5 * (atas + bawah);
        return super.luas(sisi, tinggi);
    }

    double keliling() {
        return super.keliling(sisiMiring2, sisiMiring1, atas, bawah);
    }
}

public class HitungLuasDanVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("================ BANGUN RUANG ================");
        System.out.println("1. Kubus\n2. Balok\n3. Bola\n4. Tabung");
        System.out.println("================ BANGUN DATAR ================");
        System.out.println("5. Persegi\n6. Persegi Panjang\n7. Lingkaran\n8. Trapesium");
        System.out.println("------------------------------------------------");
        System.out.print("Pilihan : ");
        int pilihan = scanner.nextInt();
        System.out.println("------------------------------------------------");

        switch (pilihan) {
            case 1: // Kubus
                System.out.print("Masukkan panjang sisi   :");
                double sisiKubus = scanner.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Kubus        : " + kubus.volume());
                System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 2: // Balok
                System.out.print("Masukkan panjang    :");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar      :");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi     :");
                double tinggiBalok = scanner.nextDouble();
                Balok balok = new Balok(panjang, lebar, tinggiBalok);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Balok        : " + balok.volume());
                System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 3: // Bola
                System.out.print("Masukkan radius :");
                double radiusBola = scanner.nextDouble();
                Bola bola = new Bola(radiusBola);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Bola         : " + bola.volume());
                System.out.println("Luas Permukaan Bola : " + bola.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 4: // Tabung
                System.out.print("Masukkan radius :");
                double radiusTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi :");
                double tinggiTabung = scanner.nextDouble();
                Tabung tabung = new Tabung(radiusTabung, tinggiTabung);
                System.out.println("------------------------------------------------");
                System.out.println("Volume Tabung           : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung   : " + tabung.luasPermukaan());
                System.out.println("------------------------------------------------");
                break;
            case 5: // Persegi
                System.out.print("Masukkan panjang sisi   :");
                double sisiPersegi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas Persegi    : " + persegi.luas());
                System.out.println("Keliling Persegi: " + persegi.keliling());
                break;
            case 6: // Persegi Panjang
                System.out.print("Masukkan panjang    :");
                double panjangPP = scanner.nextDouble();
                System.out.print("Masukkan lebar      :");
                double lebarPP = scanner.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(panjangPP, lebarPP);
                System.out.println("------------------------------------------------");
                System.out.println("Luas Persegi Panjang    : " + pp.luas());
                System.out.println("Keliling Persegi Panjang: " + pp.keliling());
                System.out.println("------------------------------------------------");
                break;
            case 7: // Lingkaran
                System.out.print("Masukkan radius :");
                double radiusLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
                System.out.println("------------------------------------------------");
                System.out.println("Luas Lingkaran      : " + lingkaran.luas());
                System.out.println("Keliling Lingkaran  : " + lingkaran.keliling());
                System.out.println("------------------------------------------------");
                break;
            case 8: // Trapesium
                System.out.print("Masukkan panjang sisi atas    :");
                double atas = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi bawah   :");
                double bawah = scanner.nextDouble();
                System.out.print("Masukkan tinggi               :");
                double tinggiTrap = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi miring 1:");
                double sisiMiring1 = scanner.nextDouble();
                System.out.print("Masukkan panjang sisi miring 2:");
                double sisiMiring2 = scanner.nextDouble();
                Trapesium trapesium = new Trapesium(atas, bawah, tinggiTrap, sisiMiring1, sisiMiring2);
                System.out.println("------------------------------------------------");
                System.out.println("Luas Trapesium      : " + trapesium.luas());
                System.out.println("Keliling Trapesium  : " + trapesium.keliling());
                System.out.println("------------------------------------------------");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}