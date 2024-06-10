public class AcaraOlahraga {
    private String name;
    private int durasi;
    private String penyiar;
    private String jenisOlahraga;
    private String deskripsi;
    public String komentar;

    public AcaraOlahraga() {
    }

    public AcaraOlahraga(String name, int durasi, String penyiar, String jenisOlahraga, String deskripsi) {
        this.name = name;
        this.durasi = durasi;
        this.penyiar = penyiar;
        this.jenisOlahraga = jenisOlahraga;
        this.deskripsi = deskripsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void displayInfo() {
        System.out.println("Nama            : " + this.getName());
        System.out.println("Durasi          : " + this.getDurasi() + " menit");
        System.out.println("Penyiar         : " + this.getPenyiar());
        System.out.println("Jenis Olahraga  : " + this.getJenisOlahraga());
        System.out.println("Deskripsi       : " + this.getDeskripsi());
    }
}