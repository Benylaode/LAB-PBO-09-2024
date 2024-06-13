import java.util.HashMap;
import java.util.Map;
public class DataBarang {
    Map<String, Double> hargaBarang;
    Map<String, Integer> stokBarang;
    String nama;
    double harga;
    int stok;
    public String getNama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public DataBarang(String nama, double harga, int stok) {
        this.hargaBarang = new HashMap<>();
        this.stokBarang = new HashMap<>();
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        hargaBarang.put(nama, harga);
        stokBarang.put(nama, stok);
    }

    public double getHarga(String nama) {
        return hargaBarang.getOrDefault(nama, 0.0);
    }

    public int getStok(String nama) {
        return stokBarang.getOrDefault(nama, 0);
    }

    public void kurangiStok(String nama, int jumlah) {
        int stokSaatIni = stokBarang.getOrDefault(nama, 0);
        stokBarang.put(nama, Math.max(stokSaatIni - jumlah, 0));
    }
}
