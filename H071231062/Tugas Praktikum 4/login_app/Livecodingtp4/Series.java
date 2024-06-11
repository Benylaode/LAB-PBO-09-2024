package login_app.Livecodingtp4;



public class Series {
    int JumlahEpisode;
    String Sutradara,Genre,Sinopsis,judul;
    
    
    public Series(int jumlahEpisode, String sutradara, String genre, String sinopsis, String judul) {
        JumlahEpisode = jumlahEpisode;
        Sutradara = sutradara;
        Genre = genre;
        Sinopsis = sinopsis;
        this.judul = judul;
    }
    public Series(){}
    public String getSutradara(){
        return Sutradara;
    }
    public void setSutradara(String sutradara) {
        this.Sutradara = sutradara;
    }
   
    public void setGenre(String genre) {
        this.Genre = genre;
    }
    public String getGenre(){
        return Genre;
    }
   
    public void setSinopsis(String sinopsis) {
        this.Sinopsis = sinopsis;
    }
    public String getSinopsis(){
        return Sinopsis;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
   
    public void setJumlahEpisode(int JumlahEpisode){
        this.JumlahEpisode = JumlahEpisode;
    }
    public int getJumlahEpisode(){
        return JumlahEpisode;
    }



    public void displayinfo(){
        System.out.println("Judul : " + judul);
        System.out.println("Jumlah Episode : " + JumlahEpisode);
        System.out.println("Sutradara : " + Sutradara);
        System.out.println("Genre: " + Genre);
        System.out.println("Sinopsis: " + Sinopsis);
    }
}
