package Series;

public class Main {
    public static void main(String[] args) {
        Series series1 = new Series();
        series1.setJudul("Harry Potter");
        series1.setJumlahEpisode(7);
        series1.setSutradara("nolan");
        series1.setGenre("fantasi");
        series1.setSinopsis("petualangan dunia sihir");
        series1.displayInfo();

        Series series2 = new Series("doraemon", 1,"mikoto","fantasi","petualangan dunia dongeng");
        System.out.println("judul           : " + series2.getJudul());
        System.out.println("jumlah episode  : " + series2.getJumlahEpisode());
        System.out.println("sutradara       : " + series2.getSutradara());
        System.out.println("genre           : " + series2.getGenre());
        System.out.println("sinopsis        : " + series2.getSinopsis());
        System.out.println();

        SelfUtils.displaySelfData();
    }
}
