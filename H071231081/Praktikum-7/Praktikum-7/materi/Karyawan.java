package materi;
class Karyawan{
    String nama;
    int umur;
    String jabatan = "Karyawan";
    double gaji = 1.21212127;
    public Karyawan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void display(){
        System.out.println();
        System.out.println("==========================");
        System.out.println("Detail Karyawan");
        System.out.println("==========================");
        System.out.println("Nama\t: " + getNama());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Umur\t: " + getUmur());
        System.out.println("Gaji\t: " + getGaji());
        // System.out.println("Organisasi: " + getOrganisasi());
        System.out.println("==========================");
    }
}