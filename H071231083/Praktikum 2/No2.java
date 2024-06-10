public class No2{
    public static void main(String[] args){
        Produk produk1 = new Produk(); //objek produk1 dari kelas produk dibuat dengan menggunakan konstruktor new produk
        produk1.ID = "S1231"; 
        produk1.nama = "Kecap Bango";
        produk1.harga = 12000;
        produk1.stok = -1;

        produk1.cekDataProduk(); // setelah objek dibuat, nilai" atributnya diatur menggunakan operator titik dan kemudian metode" dari kelas produk dipanggil utk memeriksa data produk dan mengecek ketersediaan stok
        produk1.cekProduk();
    }
}
class Produk{
    String ID, nama; 
    int stok;
    double harga;

    void cekDataProduk(){
       // mencetak data produk seperti nama,id,stok dan harga
        System.out.println("DATA PRODUK");
        System.out.println("Nama        : " + this.nama);
        System.out.println("ID Produk   : " + this.ID);
        System.out.println("Stok        : " + stok);
        System.out.printf("Harga       : Rp.%.2f\n", harga);
    }

    void cekProduk(){ 
        if (stok <= 0){
            System.out.println("Tidak Tersedia");
        } else {
            System.out.println("Stok tersedia : "+ stok);
        }
    }
}