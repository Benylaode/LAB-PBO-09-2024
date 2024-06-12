package tgspraktikump7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Karyawan {
    boolean cek = true;
    String nama;
    String jabatan = "Karyawan";
    int umur;
    int gaji;

    Scanner sc = new Scanner(System.in);

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    void datakaryawan() {
        while (cek) {
            try {
                if (nama == null) {
                    System.out.println("Masukkan nama : ");
                    nama = sc.nextLine();
                }
                System.out.println("Masukkan umur : ");
                umur = sc.nextInt();
                sc.nextLine(); 

                if (umur < 18) {
                    System.out.println("================================");
                    System.out.println(">> Umur anda harus minimal 18 tahun <<");
                    System.out.println("================================");
                    Main.Sound("tgspraktikump7/tetot.wav");
                } else {
                    cek = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inputan tidak valid. Silakan masukkan angka.");
                sc.nextLine(); 
                cek = true;
            }
        }

        
        System.out.println("Masukkan jabatan : ");
        jabatan = sc.nextLine();
        
    }
}


