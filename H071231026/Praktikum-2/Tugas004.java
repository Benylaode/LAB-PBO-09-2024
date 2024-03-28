class Alamat {
    String jalan;
    String kota;

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }

    public String getJalan() {
        return jalan;
    }

    public String getKota() {
        return kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public Mahasiswa(String nama, String nim, Alamat alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.getJalan() + ", " + alamat.getKota();
    }
}

public class Tugas004 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat("Tamalanrea Raya", "Makassar");
        Mahasiswa mahasiswa = new Mahasiswa("Zainab Muchsinin", "H071231026", alamat);

        System.out.println("==========   Data Mahasiswa   ==========");
        System.out.println("Nama      : " + mahasiswa.getNama());
        System.out.println("NIM       : " + mahasiswa.getNim());
        System.out.println("Alamat    : " + mahasiswa.getAlamat());
    }
}