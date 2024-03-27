class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.getJalan()+ ", " + alamat.getKota();

    }
}

class Alamat {
    String jalan;
    String kota;
    String alamatFinal;

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }
}

public class TP4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat("Tamalanrea Indah", "Makassar");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231041";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
