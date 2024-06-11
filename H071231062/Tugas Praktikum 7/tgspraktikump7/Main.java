package tgspraktikump7;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Karyawan {
    Scanner sc = new Scanner(System.in);
    Pengalaman pnglmn = new Pengalaman();
    Pendidikan pnddkn = new Pendidikan();
    Projek prjk = new Projek();
    ArrayList<String> str = new ArrayList<String>();
    ArrayList<Integer> Int = new ArrayList<Integer>();
    boolean cek = false;

    
    String nama;
    String jabatan;
    int umur;
    int gaji;

    public static void Sound(String filename){
        try {
            File file = new File(filename);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Main utama = new Main();
        utama.menutmpil();
    }

    void addkaryawan(){
        str.add(nama);
        str.add(jabatan);
        Int.add(umur);
        Int.add(gaji);
    }

    void detailkaryawan(){
        int size = Math.min(str.size(), Int.size() / 2);
        if (str.isEmpty() || Int.isEmpty()) {
            System.out.println("DATA KOSONG");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println("==========");
                System.out.println("Detail karyawan : ");
                System.out.println("Nama : " + str.get(i * 2));
                System.out.println("Jabatan : " + str.get(i * 2 + 1));
                System.out.println("Umur : " + Int.get(i * 2));
                System.out.println("Gaji : " + Int.get(i * 2 + 1));
                System.out.println("==========");
            }
        }
    }

    void menutmpil() {
        while (true) {
            System.out.println("Data Karyawan: ");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.println("Pilih opsi (a-c) : ");
            String pilih = sc.nextLine();

            switch (pilih) {
                case "a":
                    System.out.println("Masukkan Nama: ");
                    nama = sc.nextLine();
                    boolean validUmur = false;
                    while (!validUmur) {
                        try {
                            System.out.println("Masukkan Umur: ");
                            umur = sc.nextInt();
                            sc.nextLine(); 
                            if (umur < 18) {
                                System.out.println("================================");
                                System.out.println(">> Umur anda harus minimal 18 tahun <<");
                                System.out.println("================================");
                                Main.Sound("tgspraktikump7/tetot.wav");
                            } else {
                                validUmur = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Inputan tidak valid. Silakan masukkan angka.");
                            sc.nextLine(); 
                        }
                    }
                    System.out.println("Masukkan Jabatan: ");
                    jabatan = sc.nextLine();
                    System.out.println("Masukkan Gaji: ");
                    gaji = sc.nextInt();
                    sc.nextLine(); 
                    addkaryawan();
                    pnglmn.pernahbekerjadi();
                    pnddkn.cekpendidikan();
                    pnglmn.ceknikah();
                    pnglmn.organisasi();
                    prjk.cekprojek(this);
                    break;
                case "b":
                    detailkaryawan();
                    break;
                case "c":
                    System.out.println("GOODBYEEEE");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan pilih opsi yang sesuai");
                    break;
            }
        }
    }
}
