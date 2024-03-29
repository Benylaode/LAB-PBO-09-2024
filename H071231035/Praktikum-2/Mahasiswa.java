public class Mahasiswa{
    String nama;
    String NIM;
    Alamat alamat;


    public String getNama(){
        return nama;
    }
    public String getNIM(){
        return NIM;
    }
    public String getAlamat(){
        return this.alamat.getJalan()+", "+ this.alamat.getKota();
    }
}