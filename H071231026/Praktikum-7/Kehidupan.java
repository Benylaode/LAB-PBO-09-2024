import java.util.Scanner;

public abstract class Kehidupan extends Karyawan {
    Scanner sc = new Scanner(System.in);
    int nilaiPlus = 1;

    public Kehidupan(String nama, int gaji) {
        super(nama, gaji);
    }

    public Kehidupan() {
    }

    public abstract void prosesKehidupan();

    public int getNilaiPlus() {
        return nilaiPlus;
    }
}