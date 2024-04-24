package soal2;
import java.util.Scanner;
import java.util.ArrayList;
// import soal2.Camera;
// import soal2.Product;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> listproduk = new ArrayList<>();

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }
    private static void runApp() {
        System.out.println("Menu:");
        System.out.println("1. Tambah produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.println();
        System.out.print(">>> Pilih Menu (1-4): ");

        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                tambahProduk(sc);
                break;
            case 2:
                tampilkanSemuaProduk();
                break;
            case 3:
                beliProduk();
                break;
            case 4:
            System.out.println("Terima kasih telah menggunakan aplikasi kami");
                System.exit(0);
            default:
            System.out.println("pilihan tidak valid");
                runApp();
        }
    }
    private static void tambahProduk(Scanner sc) {
        System.out.print("Masukkan nama produk: ");
        String brand = sc.next();
        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = sc.nextInt();
        System.out.print("Masukkan harga: ");
        double price = sc.nextDouble();
        System.out.println("Pilih Tipe Produk: ");
        System.out.println("1. Smartphone");
        System.out.println("2. Camera");
        System.out.println("3. Laptop");
        System.out.print("Pilih Tipe Produk: (1-3): ");
        int selectProduct = sc.nextInt();
        switch (selectProduct) {
            case 1:
                System.out.print("masukkan ukuran layar (inci): ");
                int screensize = sc.nextInt();
                System.out.print("masukkan kapasitas penyimpanan: ");
                int storageCapacity = sc.nextInt();
                Smartphone smartphone = new Smartphone(brand,seriesNumber,price,screensize, storageCapacity);
                listproduk.add(smartphone);
                runApp();
                break;
            case 2:
                System.out.print("Masukkan resolusi: ");
                int resolution = sc.nextInt();
                System.out.print("Masukkan jenis lensa kamera: ");
                String lensType = sc.next();
                Camera camera = new Camera(brand, seriesNumber, price, resolution, lensType);                
                listproduk.add(camera);
                runApp();
                break;
            case 3:
                System.out.print("Masukkan ukuran RAM: ");
                int ramsize = sc.nextInt();
                System.out.print("Masukkan jenis prosesor: ");
                String processorType = sc.next();
                Laptop laptop = new Laptop(brand, seriesNumber, price,ramsize, processorType);
                listproduk.add(laptop);
                runApp();
                break;
            default:
                break;
        }
        
    }
    private static void tampilkanSemuaProduk() {
        System.out.println("Daftar Produk:");
        for (Product product : listproduk) {
            product.displayInfo();
            System.out.println();
        }
        runApp();
    }

    private static void beliProduk() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli:");
        int seriesNumber = sc.nextInt();
        boolean isProductFound = false;
        for (Product product : listproduk) {
            if (product.getSeriesNumber() == seriesNumber) {
                isProductFound = true;
                System.out.println("Anda telah membeli produk:");
                product.displayInfo();
                break;
            }
        }
        if (!isProductFound) {
            System.out.println("Produk yang ingin dibeli tidak ditemukan.");
        }
    }
}
