import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<Peserta> pesertas = new ArrayList<>();
        
        Peserta peserta1 = new Peserta("Zainab", 17, "Makassar", 700.0);
        Peserta peserta2 = new Peserta("Muchsinin", 20, "Surabaya", 550.0 );
        pesertas.add(peserta1);
        pesertas.add(peserta2);
        Olimpiade olimpiade1 = new Olimpiade("Olimpiade Matematika", peserta1, 2024);
        olimpiade1.setListPeserta(pesertas);

        printBarriers();
        olimpiade1.displayOlimpiadeInfo();
        printBarriers();
        peserta1.displayPesertaInfo();
        printBarriers();
        peserta1.upgradeScore(900.0);
        printBarriers();
        peserta1.winnerScore();

        peserta2.displayPesertaInfo();
        printBarriers();
        peserta2.upgradeScore(700.0);
        printBarriers();
        peserta2.winnerScore();

        printBarriers();
        olimpiade1.displayPemenang( );

    }

    public static void printBarriers() {
        System.out.println("===============================================");
    }
}