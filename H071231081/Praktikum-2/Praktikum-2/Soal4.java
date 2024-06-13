public class Soal4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Andi Mangerangi";
        alamat.kota = "Makassar";

        Mahasiswa Mahasiswa = new Mahasiswa();
        Mahasiswa.alamat = alamat;
        Mahasiswa.nama = "zahra salsabila";
        Mahasiswa.NIM = "H071231035";

        System.out.println("nama   : " + Mahasiswa.getNama());
        System.out.println("NIM    : " + Mahasiswa.getNIM());
        System.out.println("alamat : " + Mahasiswa.getAlamat());
    }
}

