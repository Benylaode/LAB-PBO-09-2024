package Soal_01;

import java.util.Scanner;

class BangunDatar {
    protected double luas;
    protected double keliling;

    Scanner input = new Scanner(System.in);

    void showLuasKeliling() {
        System.out.println("Luas     : " + luas);
        System.out.println("Keliling : " + keliling);

    }
}

class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(double sisi) {
        super.luas = sisi * sisi;
        super.keliling = 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    protected double sisi_panjang, sisi_lebar;

    public PersegiPanjang(double sisi_panjang, double sisi_lebar) {
        super.luas = sisi_panjang * sisi_lebar;
        super.keliling = 2 * (sisi_panjang * sisi_lebar);
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;
    double diameter;

    public Lingkaran(double jariJari) {
        super.luas = 3.14 * jariJari * jariJari;
        super.keliling = 2 * 3.14 * jariJari;
    }

    public Lingkaran(double diameter, String s) {
        super.luas = 3.14 * (diameter / 2);
        super.keliling = 3.14 * diameter;
    }
}

class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4, tinggi;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        super.luas = ((sisi1 + sisi2) * tinggi) / 2;
        super.keliling = sisi1 + sisi2 + sisi3 + sisi4;
    }

}
