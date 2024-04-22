package Series;

public class Series {

    private String judul,sutradara,genre;
    private int jumlahEpisode;
    public String sinopsis;
    public Series(){

    }
    public Series(String judul, int jumlahEpisode, String sutradara, String genre, String sinopsis) {
        this.judul = judul;
        this.jumlahEpisode = jumlahEpisode;
        this.sutradara = sutradara;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahEpisode() {
        return jumlahEpisode;
    }

    public void setJumlahEpisode(int jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public void displayInfo(){
        System.out.println("judul           : " + getJudul());
        System.out.println("jumlah episode  : " + getJumlahEpisode());
        System.out.println("sutradara       : " + getSutradara());
        System.out.println("genre           : " + getGenre());
        System.out.println("sinopsis        : " + getSinopsis());
        System.out.println();
    }
}
