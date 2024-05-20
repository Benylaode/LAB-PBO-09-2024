public class Karyawan extends Keluarga {
    String nama, jabatan = "Karyawan";
    int gaji, umur;

    public Karyawan() {
    }

    public Karyawan(String nama, int gaji, int umur) {
        this.nama = nama;
        this.gaji = gaji;
        this.umur = umur;
    }

    public Karyawan(String nama, String jabatan, int gaji, int umur) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.umur = umur;
    }

    public Karyawan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void displayInfo() {
        Main.batas();
        System.err.println("Detail Karyawan :");
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Umur\t\t: " + this.umur);
        System.out.println("Status\t\t: " + this.status);
        System.out.println("Jumlah Anak\t: " + this.jumlahAnak);
        System.out.println("Jabatan\t\t: " + this.jabatan);
        System.out.println("Gaji\t\t: " + this.gaji);
        Main.batas();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}