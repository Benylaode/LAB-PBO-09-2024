package tgspraktikump2;

public class produk {
    String ID;
    String nama;
    int stok;
    int harga;

    public String getID(){
        return ID;
    }
    public void setID(String newID){
        this.ID = newID;
    }

    public String getnama(){
        return nama;
    }
    public void setnama(String newnama){
        this.nama = newnama;
    }
    
    public int getstok(){
        return stok;
    }
    public void setstok(int newstok){
        this.stok = newstok;
    }

    public int getharga(){
        return harga;
    }
    public void setharga(int newharga){
        this.harga = newharga;
    }

    public void cekproduk(){
        System.out.println("Nama barang anda " + nama);
        System.out.println("ID produk " + ID);
        System.out.println("Stok barang sejumlah " + stok);
        System.out.println("Harga barang : " + harga);
    }

    /*public String cekharga(){
        return String.format("%,d",harga ).replace(',', '.');
    }*/
    public void cekstok(){
        if(stok > 0){
            System.out.println("Barang masih ada selamat menikmati");
        }else{
            System.out.println("Barang sudah habis, mohon bersabar ini ujian");
        }
    }
    public static void main(String[] args) {
        produk Product = new produk();
        Product.setID("1234fjgk32443");
        Product.setnama("Ayam Eskage");
        Product.setstok(0);
        Product.setharga(15000);
        Product.cekstok();
        Product.cekproduk();

        
    }
}
