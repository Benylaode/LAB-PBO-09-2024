package tgspraktikump7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    int PengalamanHidup;
    String cekstatus;
    int jumlahorganisasi;
    boolean status;
    
    Scanner sc = new Scanner(System.in);

    public int getPengalamanHidup() {
        return PengalamanHidup;
    }

    public void setPengalamanHidup(int pengalamanHidup) {
        PengalamanHidup = pengalamanHidup;
    }
    
    @Override
    void proseskehidupan(){
        throw new UnsupportedOperationException("Unimplemented method proseskehidupan");
    }
    void pernahbekerjadi(){
        boolean cekinput = false;
        while (!cekinput) {
            try {
                System.out.println("Pengalaman sebelumnya : ");
                System.out.println("1. Freelancer");
                System.out.println("2. Magang");
                System.out.println("3. Pekerja tetap");
                System.out.println("4. Tidak ada");
                System.out.println("Input :");
                PengalamanHidup=  sc.nextInt();

                cekinput = true;
                break;
            } catch (InputMismatchException e){
                System.out.println("Input tidak sesuai");
                sc.nextLine();
            }
        }
    }
    void organisasi(){
        boolean cekinput = true;
        while (cekinput) {
            try{
                System.out.println("Jumlah organisasi sebelumnya : ");
                jumlahorganisasi = sc.nextInt();
                cekinput = false;

                if (jumlahorganisasi < 1){
                    System.out.println("Tidak memenuhi syarat");
                    System.exit(0);
                }
            } catch (InputMismatchException e){
                System.out.println("Inputan tidak sesuai, coba lagi!");
                sc.nextLine();
            }
        }
    }
   void ceknikah(){
    System.out.println("Apakah anda sudah menikah?");
    System.out.println("iya/tidak");
    do {
        cekstatus = sc.nextLine();
    } while (cekstatus.isEmpty());
    if(cekstatus.equals("iya")){
        status = true;
    }else {
        status = false;
    }
   }
}
