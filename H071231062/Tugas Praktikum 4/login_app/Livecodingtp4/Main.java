package login_app.Livecodingtp4;

public class Main {
    public static void main(String[] args) {
        Series series = new Series();
    series.setJudul("Avatar");
    series.setJumlahEpisode(2);
    series.setSutradara("James Cameron");
    series.setGenre("Adventure,Survival");
    series.setSinopsis("Marinir lumpuh yang dikirim ke bulan pandora");
    series.displayinfo();
    Series series2 = new Series(100, "agus","slice of live","anak kecil yang mendapatkan robot dari masa depan","Doraemon");
    System.out.println(series2.getJudul());
    System.out.println(series2.getJumlahEpisode());
    System.out.println(series2.getSutradara());
    System.out.println(series2.getGenre());
System.out.println(series2.getSinopsis());
    Selfutils.displaySelfData();
    }
 }




