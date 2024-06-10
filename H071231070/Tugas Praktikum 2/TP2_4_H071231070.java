public class TP2_4_H071231070 {
          
    public static void main(String[] args){
        Alamat alamat = new Alamat();
        alamat.jalan  = "Jalan kowilham 3";
        alamat.kota   = "Kota Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama   = "zia";
        mahasiswa.nim    = "H071231070";

        System.out.println("Nama : "+ mahasiswa.getNama());
        System.out.println("Nim : "+ mahasiswa.getNim());
        System.out.println("Alamat : "+ mahasiswa.getAlamat());
    }
    
}

class Alamat{
    String jalan;
    String kota;

    
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    String getNama(){
        return nama;
    }
    String getNim(){
        return nim;
    }
    String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;

    }
}
