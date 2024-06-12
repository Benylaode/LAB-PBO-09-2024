public class Soal3 {
    double tinggi;
    double lebar;
    double panjang;

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getVolume(){
        return tinggi *lebar * panjang;
    }
    public static void main(String[] args) {
        Soal3 cuboid = new Soal3();
        cuboid.setTinggi(10.00);
        cuboid.setLebar(15.00);
        cuboid.setPanjang(30.00);
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
