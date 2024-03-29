public class Soal2 {
    int stock;
    String name;
    String ID;
    int harga;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void cekdata(){
        System.out.println("ID    :" + ID);
        System.out.println("Nama  :" + name);
        System.out.println("Harga :" + harga);
    }
    public String cekStock(){
        return (stock > 0)?
        (name + " masih tersisa " + stock + " di stock"):(name + " sudah habis di stock");
    }

    public static void main(String[] args) {
        Soal2 buku = new Soal2();
        buku.setname("buku");
        buku.setID("220433");
        buku.setHarga(32000);
        buku.setStock(17);

        buku.cekdata();
        System.out.println(buku.cekStock());
    }
    
}
