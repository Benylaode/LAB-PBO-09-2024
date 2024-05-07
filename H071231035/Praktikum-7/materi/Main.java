package materi;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Karyawan> listpegawai = new ArrayList<>();
    
    public static void main(String[] args) {
        runApp();
    }
    private static void runApp() {
        System.out.println("Data karyawan");
        System.out.println("a. Tambah data karyawan");
        System.out.println("b. Tampilkan detail karyawan");
        System.out.println("c. keluar");
        System.out.print("pilih opsi(a-c): ");
        
        String selectMenu = sc.nextLine();
        switch (selectMenu) {
            case "a":
            tambahData(sc);
            runApp();
            break;
            case "b":
            tampilkanDataKaryawan();
            runApp();
            break;
            case "c":
            System.out.println("Terima kasih telah menggunakan aplikasi kami");
            System.exit(0);
            default:
            System.out.println("pilihan tidak valid");
            runApp();
        }
    }
        
//     }
    private static void tambahData(Scanner sc) {
        System.out.println("\nTambah Data Karyawan");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Umur: ");
        int umur = sc.nextInt();
        
        System.out.println("pengalaman sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja tetap");
        System.out.println("4. Tidak ada");
        System.out.print("Input: ");
        int select = sc.nextInt();

        if(select == 4){
            System.out.println("organisasi sebelumnya:");
            System.out.println("1. OSIS");
            System.out.println("2. PMR");
            System.out.println("3. Lainnya");
            System.out.println("4. Tidak ada ");
            System.out.print("Input: ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    select = 1;
                    break;
                case 2:
                    select = 2;
                    break;
                case 3:
                // System.out.print("masukkan organisasi");
                // String organisasi = sc.nextLine();
                    select = 3; 
                    break;
                case 4:
                    select = 4;
                    break;
                default:
                    break;
            }
        }
     

        
        System.out.print("pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        String pendidikan = sc.next();
        sc.nextLine();
        System.out.println("Projek IT: ");
        System.out.println("1. minimal 4");
        System.out.println("2. minimal 8");
        System.out.println("3. minimal 12");
        System.out.println("4. lebih dari 15");
        
        System.out.print("input: ");
        int projekk = sc.nextInt();

        sc.nextLine();
        Karyawan karyawan = new Karyawan(nama, umur);
        Pendidikan pendidikan1 = new Pendidikan(pendidikan);
        Projek projek1 = new Projek(projekk);

        listpegawai.add(karyawan);

        if((pendidikan.equalsIgnoreCase("SMA") || pendidikan.equalsIgnoreCase("S2") ||pendidikan.equalsIgnoreCase("S1") ||pendidikan.equalsIgnoreCase("SMK") ||pendidikan.equalsIgnoreCase("S3")) && (projekk > 1) && (umur > 18 ) && (select != 4)){
            System.out.println("Pengalaman sedang diproses.......");
            pendidikan1.prosesKehidupan();
            projek1.jumlahProjek();
            System.out.println("===============================");
            System.out.println("Selamat, karyawan diterima!!!");
            System.out.println("===============================");
        }else{
            System.out.println("Karyawan tidak memenuhi syarat");
            listpegawai.remove(karyawan);
        }
        } 
    public static void tampilkanDataKaryawan(){
        if(listpegawai.isEmpty()){
            System.out.println("Belum ada data karyawan");
            return;
        }
        for(Karyawan karyawan : listpegawai){
            karyawan.display();
        }
    }
}