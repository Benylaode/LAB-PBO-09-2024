class Tugas002 {
    int id;
    String namaProduk;
    int stok;
    double harga;

    public Tugas002(int id, String namaProduk, int stok, double harga) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.stok = (stok < 0) ? 0 : stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isAvailable() {
        return stok > 0;
    }


    public static void main(String[] args) {
        Tugas002 produk1 = new Tugas002(1, "Buku", 10, 4500.00);
        Tugas002 produk2 = new Tugas002(2, "Pulpen", 20, 1200.00);

        System.out.println("=====Informasi Produk 1=====");
        System.out.println("ID Produk       : " + produk1.getId());
        System.out.println("Nama Produk     : " + produk1.getNamaProduk());
        System.out.println("Stok            : " + produk1.getStok());  
        System.out.println("Harga           : " + produk1.getHarga());
        System.out.println("Stok Tersedia   : " + (produk1.isAvailable() ? "Ya" : "Tidak"));

        System.out.println("\n=====Informasi Produk 2=====");
        System.out.println("ID Produk       : " + produk2.getId());
        System.out.println("Nama Produk     : " + produk2.getNamaProduk());
        System.out.println("Stok            : " + produk2.getStok());  
        System.out.println("Harga           : " + produk2.getHarga());
        System.out.println("Stok Tersedia   : " + (produk2.isAvailable() ? "Ya" : "Tidak"));
    }
}