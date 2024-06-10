package nomor2;

public class Main {
    public static void main(String[] args) {
        
        AcaraOlahraga acaraOlahraga = new AcaraOlahraga();
        acaraOlahraga.setNama("Piala Dunia");
        acaraOlahraga.setDurasi(120);
        acaraOlahraga.setPenyiar("kesi");
        acaraOlahraga.setJenisOlahraga("Sepak Bola");
        acaraOlahraga.setDeskripsi("piala dunia 2022 sangat indah");
        acaraOlahraga.displayinfo();

        AcaraOlahraga acara2 = new AcaraOlahraga("Piala Dunia", 120, "kesi", "Sepak Bola", "piala dunia 2022 sangat indah");
        acara2.displayinfo();

        SelfUtils.DisplaySelfData();
    }
}
