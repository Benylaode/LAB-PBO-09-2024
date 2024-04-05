import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<DataBarang> dataBarang = new ArrayList<>();
        DataBarang kemeja = new DataBarang("kemeja", 150000, 10);
        DataBarang celana = new DataBarang("celana", 200000, 7);
        DataBarang jaket = new DataBarang("jaket", 300000, 5);
        dataBarang.add(kemeja);
        dataBarang.add(jaket);
        dataBarang.add(celana);
        TokoPakaian toko = new TokoPakaian("FashionMall", "Jalan Raya",dataBarang);
        

        toko.info();

        System.out.println("\nPembelian Kemeja oleh Pelanggan1:");
        if (toko.beliBarang("kemeja", 2, 3000000)) {
            System.out.println("Pembelian berhasil!");
        } else {
            System.out.println("Pembelian gagal");
        }

        toko.info();
        
        System.out.println("\nPembelian Rok oleh Pelanggan1:");
        if (toko.beliBarang("celana",3, 8000000)) {
            System.out.println("Pembelian berhasil");
        } else {
            System.out.println("Pembelian gagal");
        }
        toko.info();
    }
}
