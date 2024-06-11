package tgspraktikump2;


class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;
    
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getAlamat(){
        return alamat.getAlamat();
    }
}

class Alamat {
    String jalan;
    String kota;

    public String getAlamat(){
        return jalan + "," + kota;
    }
}
/*public class Main2 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.Nama = "MvL";
        mahasiswa.Nim = "H071231062";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }*/
public class Main2{
public static void main(String[] args) {
    Alamat almt = new Alamat();
    almt.jalan = "Tamalanrea Indah";
    almt.kota = "Makassar";

    Mahasiswa mahasiswa = new Mahasiswa();
    mahasiswa.alamat = almt;
    mahasiswa.nama = "Farhan";
    mahasiswa.nim= "H071231025";

    System.out.println("Nama: "+ mahasiswa.getNama());
    //System.out.println("Alamat: " + mahasiswa.getAlamat() );
    System.out.println("Nim: "+ mahasiswa.getNim()); System.out.println("Alamat: "+ mahasiswa.getAlamat());

}


}
