import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Karyawan {
    Scanner scanner = new Scanner(System.in);
    Karyawan karyawan = new Karyawan();
    Pengalaman pengalaman = new Pengalaman();
    Pendidikan pendidikan = new Pendidikan();
    Projek projek = new Projek();
    Keluarga keluarga = new Keluarga();
    ArrayList<String> yangStrings = new ArrayList<String>();
    ArrayList<Karyawan> karyawanList = new ArrayList<Karyawan>();

    ArrayList<Integer> yangIntegers = new ArrayList<Integer>();
    boolean syarat = false;

    public static void playSound(String filename) {
        try {
            File file = new File(filename);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Main utama = new Main();
        utama.menuUtama();

    }

    void tambahKaryawan() {
        yangStrings.add(nama);
        yangStrings.add(jabatan);
        yangIntegers.add(umur);
        yangIntegers.add(gaji);
        yangStrings.add(keluarga.cekNikah);
        karyawanList.add(karyawan);
    }

    void tampilkanDetailKaryawan() {
        if (yangIntegers.isEmpty()) {
            System.out.println("============================================");
            System.out.println("Data kosong");
            System.out.println("============================================");
        } else if (yangStrings.isEmpty()) {
            System.out.println("============================================");
            System.out.println("Data kosong");
            System.out.println("============================================");
        }

        for (int i = 0; i < karyawanList.size(); i++) {
            System.out.println("============================================");
            System.out.println("Detail karyawan : ");
            System.out.println("Nama : " + karyawanList.get(i).getNama());
            System.out.println("Jabatan: " + karyawanList.get(i).getJabatan());
            System.out.println("Umur: " + karyawanList.get(i).getUmur());
            System.out.println("Gaji: " + karyawanList.get(i).getUmur());
            // System.out.println("Status menikah : " + karyawanList.get(i));
            System.out.println("============================================");
        }
    }

    void menuUtama() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        while (true) {
            System.out.println("Data Karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine().toUpperCase();

            switch (pilihan) {
                case "A":
                case " A":
                    karyawan.detailKaryawan();

                    if (karyawan.umur > 18) {
                        pengalaman.jumlahPekerjaanSebelumnya();
                        pengalaman.jumlahOrganisasi();
                        pendidikan.cekPendidikan();
                        if (!pendidikan.pendidikan.equals("SD") && !pendidikan.pendidikan.equals("SMP")) {
                            projek.cekProjek(this);
                            System.out.print("Masukkan Gaji:");
                            karyawan.gaji = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Masukkan jabatan: ");
                            karyawan.jabatan = scanner.nextLine();

                            Main.playSound("congrats.wav");
                            keluarga.cekMenikah();
                            tambahKaryawan();

                            break;
                        }

                    } else {
                        System.out.println("Tidak memenuhi syarat");
                        karyawan.validasi = true;
                    }

                case "B":
                case " B":
                    tampilkanDetailKaryawan();
                    break;

                case "C":
                case " C":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang sesuai.");
            }
        }
    }

}