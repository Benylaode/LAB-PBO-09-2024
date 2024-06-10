import java.util.InputMismatchException;
import java.util.Scanner;

public class Karyawan {
    String nama;
    int umur;
    String jabatan;
    int gaji;
    boolean validasi = true;
    Scanner scanner = new Scanner(System.in);

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    void detailKaryawan() {
        System.out.print("Masukkan nama:");
        nama = scanner.nextLine();
        while (validasi) {
            try {
                System.out.print("Masukkan umur:");
                umur = scanner.nextInt();
                scanner.nextLine();
                validasi = false;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid.");
                scanner.nextLine();
                validasi = true;
            }
        }
    }
}
