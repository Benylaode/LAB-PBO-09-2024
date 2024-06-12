package tgspraktikump7;
import java.util.Scanner;
public class Projek {
    String proyek;
    Scanner sc = new Scanner(System.in);

    // public String getProyek() {
    //     return proyek;
    // }

    // public void setProyek(String proyek) {
    //     this.proyek = proyek;
    // }
    void cekprojek(Main mainInstance){
        System.out.println("Projek IT :");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.println("Input");
        proyek = sc.nextLine();

        if(proyek.equals("1")){
            System.out.println("Tidak memenuhi syarat");
            Main.Sound("tgspraktikump7/accesdenied.wav");
            // System.exit(0);
        }else {
            System.out.println("Memenuhi syarat");
            // System.out.println("Masukkan gaji : ");
            // mainInstance.gaji = sc.nextInt();
            // sc.nextLine();
            // System.out.println("Masukkan jabatan : ");
            // mainInstance.jabatan = sc.nextLine();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("SELAMAT ANDA DITERIMAAA!!!!!!!!!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


            Main.Sound("tgspraktikump7/f1.wav");
        }
    }
    
}