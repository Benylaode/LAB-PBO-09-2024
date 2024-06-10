package nomor2;

public class AcaraOlahraga {
    private String nama;
    private int durasi;
    private String penyiar;
    private String jenisOlahraga;
    private String deskripsi;
    
    public AcaraOlahraga(String nama, int durasi, String penyiar, String jenisOlahraga, String deskripsi) {
        this.nama = nama;
        this.durasi = durasi;
        this.penyiar = penyiar;
        this.jenisOlahraga = jenisOlahraga;
        this.deskripsi = deskripsi;
    }
    public AcaraOlahraga() {
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getDurasi() {
        return durasi;
    }
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    public String getPenyiar() {
        return penyiar;
    }
    public void setPenyiar(String penyiar) {
        this.penyiar = penyiar;
    }
    public String getJenisOlahraga() {
        return jenisOlahraga;
    }
    public void setJenisOlahraga(String jenisOlahraga) {
        this.jenisOlahraga = jenisOlahraga;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void displayinfo() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("Durasi : " + getDurasi());
        System.out.println("Penyiar : " + getPenyiar());
        System.out.println("Jenis Olahraga " + getJenisOlahraga());
        System.out.println("Deskripsi " + getDeskripsi());
    }
}
