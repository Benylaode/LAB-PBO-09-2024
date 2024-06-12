package tgspraktikump7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Pendidikan {
    String jenjangpendidikan;
    Scanner sc = new Scanner(System.in);

    public String getJenjangpendidikan() {
        return jenjangpendidikan;
    }

    public void setJenjangpendidikan(String jenjangpendidikan) {
        this.jenjangpendidikan = jenjangpendidikan;
    }
    void cekpendidikan(){
        boolean ceksyarat = false;
        try{
            System.out.println("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");
            jenjangpendidikan = sc.nextLine();
            if(jenjangpendidikan.equals("SMP")){
                System.out.println("Tidak memenuhi syarat");
                Main.Sound("tgspraktikump7/accesdenied.wav");
                ceksyarat = false;
                Main m = new Main();
                m.menutmpil();
            }else if (jenjangpendidikan.equals("SD")){
                System.out.println("Tidak memenuhi syarat");
                Main.Sound("tgspraktikump7/accesdenied.wav");
                ceksyarat = false;          
            }else if(jenjangpendidikan.equals("SMA")){
                System.out.println("Memenuhi syarat");
                ceksyarat = true;
            }else if(jenjangpendidikan.equals("SMK")){
                System.out.println("Memenuhi syarat");
                ceksyarat = true;
            }else if(jenjangpendidikan.equals("S1")){
                System.out.println("Memenuhi Syarat");
                ceksyarat = true;
            }else if(jenjangpendidikan.equals("S2")){
                System.out.println("Memenuhi syarat");
                ceksyarat = true;
            }else if(jenjangpendidikan.equals("S3")){
                System.out.println("Memenuhi syarat");
                ceksyarat = true;
            }else{
                System.out.println("Input tidak sesuai");
                System.exit(0);
            }
        } catch (InputMismatchException e){
            System.out.println("Input tidak sesuai");
        }
        if(!ceksyarat) {
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.exit(0);
        }
    }
}
