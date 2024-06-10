package praktikum4b;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        AcaraOlahraga acara1 = new AcaraOlahraga();
        
        acara1.setNama("Pertandingan Sepak Bola");
        acara1.setDurasi(90);
        acara1.setPenyiar("Zainab");
        acara1.setJenisOlahraga("Sepak Bola");
        acara1.setDeskripsi("Pertandingan MU dan Barca");
        acara1.displayInfo();
        System.out.println("==============================================");

        AcaraOlahraga acara2 = new AcaraOlahraga("Pertandingan Basket", 45, "Fara", "Basket", "Pertandingan Unhas dan UNM");
        acara2.displayInfo();
        System.out.println("==============================================");

        SelfUtils.displaySelfData("Zainab Muchsinin", "H071231026");
        System.out.println("==============================================");
    }
}
