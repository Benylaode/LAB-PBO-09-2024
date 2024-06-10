import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void dataKaryawan() {
        System.out.println("------------- Data Karyawan ------------");
        System.out.println("a. Tambah Data Karyawan");
        System.out.println("b. Tampilkan Detail karyawan");
        System.out.println("c. keluar");
        System.out.print("Pilih Opsi (a-c) : ");
    }

    public static void batas() {
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        ArrayList<Karyawan> data = new ArrayList<>();
        boolean stop = false;
        while (!stop) {
            Scanner sc = new Scanner(System.in);
            Main.dataKaryawan();
            String pilihan = sc.nextLine();
            switch (pilihan) {
                case "a":
                    Karyawan karyawan = new Karyawan();
                    boolean valid = false;
                    System.out.print("Masukkan nama\t: ");
                    karyawan.setNama(sc.nextLine());
                    while (!valid) {
                        try {
                            System.out.print("Masukkan umur\t: ");
                            karyawan.setUmur(sc.nextInt());
                            sc.nextLine();
                            valid = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Inputan tidak valid");
                            sc.nextLine();
                        }
                    }
                    Pengalaman pengalaman = new Pengalaman(karyawan.getNama(), karyawan.getUmur());
                    pengalaman.status();
                    pengalaman.pengalamanKerja();
                    pengalaman.organisasi();
                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.pendidikanKaryawan();
                    Projek projek = new Projek();
                    projek.jumlahProjek();

                    System.out.println(pendidikan.getNilaiPlus() + projek.getNilaiPlus() + pengalaman.getNilaiPlus());
                    System.out.println(pendidikan.getNilaiPlus());
                    System.out.println(projek.getNilaiPlus());
                    System.out.println(pengalaman.getNilaiPlus());
                    System.out.println(pengalaman.getUmur()); 

                    if (pendidikan.getNilaiPlus() == 1 && projek.getNilaiPlus() == 1 && pengalaman.getUmur() > 18
                        && pengalaman.getNilaiPlus() == 1) {
                            System.out.println("Pengalaman sedang diproses...");
                            Sound.playSound("tp7a.wav");
                            pendidikan.prosesKehidupan();
                            projek.prosesKehidupan();
                            Main.batas();
                            System.out.println("Selamat, Karyawan diterima!");
                            Main.batas();
                            data.add(pengalaman);
                        } else {
                            System.out.println("Karyawan tidak memenuhi syarat.");
                            Sound.playSound("tp7b.wav");

                    }
                    break;
                case "b":
                    if (data.isEmpty()) {
                        System.out.println("Belum ada data karyawan.");
                    } else {
                        for (Karyawan hasil : data) {
                            hasil.displayInfo();
                        }
                    }
                    break;
                
            
                case "c":
                    stop = true;
                    Main.batas();
                    System.out.println("Terimah Kasih Sudah Mendaftar");
                    Main.batas();
                    sc.close();
                    break;
                default:
                    System.out.println("Inputan Hanya a-c!");
                    break;
            }
        }

    }
}