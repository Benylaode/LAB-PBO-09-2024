
import java.util.ArrayList;
// import java.util.Map;

public class TokoPakaian{
    String name;
    String lokasi;
    int cash;
    ArrayList<DataBarang> dataBarang ;

    public TokoPakaian(String name, String lokasi, ArrayList<DataBarang> dataBarang){
        this.name = name;
        this.lokasi = lokasi;
        this.dataBarang = dataBarang;
        this.cash= 0;

    }
    public void info(){
        System.out.println("Nama Toko: " + name);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Daftar Barang:");
        for  ( int i = 0; i < dataBarang.size(); i++){
            String nama = dataBarang.get(i).getNama();
            dataBarang.get(i).getHarga(nama);
            // double harga = dataBarang.get(i).getHarga();
            dataBarang.get(i).getStok(nama);
            }
        System.out.println("Saldo Uang Toko: Rp" + cash);
    }
    public boolean beliBarang(String nama, int jumlah, double uangDibayar) {
        for (DataBarang barang : dataBarang) {
            if (barang.getNama().equalsIgnoreCase(nama)) { // Gunakan equals() untuk membandingkan String, bukan operator ==
                double hargaBarang = barang.getHarga(nama);
                int stokBarang = barang.getStok(nama);
                if (hargaBarang > 0 && stokBarang >= jumlah) {
                    double totalHarga = hargaBarang * jumlah;
                    if (uangDibayar >= totalHarga) {
                        cash += totalHarga;
                        barang.kurangiStok(nama, jumlah);
                        return true;
                    } else {
                        System.out.println("Uang pembayaran tidak mencukupi");
                        return false;
                    }
                } else {
                    System.out.println("Barang tidak tersedia atau stok tidak mencukupi");
                    return false;
                }
            }
        }
        // Jika iterasi selesai dan tidak menemukan barang dengan nama yang sesuai
        System.out.println("Barang tidak ditemukan");
        return false;
    }
    
}
    


