public class No4 { //kelas utama yg memiliki metode main
    public static void main(String[] args){
        Alamat alamat = new Alamat(); //objek alamat dari kelas alamat dibuat
        alamat.jalan  = "Jalan mangga KOMP.rumrah"; //kemudian atribut jalan dan kota dari objek alamat diisi dgn nilai tertentu
        alamat.kota   = "Kab. Gowa";

        Mahasiswa mahasiswa = new Mahasiswa(); //objek mahasiswa jg dibuat dari kelas mahasiswa
        mahasiswa.alamat = alamat;
        mahasiswa.nama   = "Ikhsan";
        mahasiswa.nim    = "H0712321083";

        System.out.println("Nama : "+ mahasiswa.getNama());
        System.out.println("Nim : "+ mahasiswa.getNim());
        System.out.println("Alamat : "+ mahasiswa.getAlamat());
    }
    
}

class Alamat{
    String jalan; //memiliki 2 atribut bertipe string
    String kota;

    // String alamat(){ // mengembalikan string yg berisi gabungan dari jalan dan kota
    //     return jalan + ", " + kota;
    // }
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    String getNama(){
        return nama; //get digunakan untuk mengakses nilai atribut dari objek mahasiswa
    }
    String getNim(){
        return nim;
    }
    String getAlamat(){
        return alamat.jalan +", " +alamat.kota;

    }
}