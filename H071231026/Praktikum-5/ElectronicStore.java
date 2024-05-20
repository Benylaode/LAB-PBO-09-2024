import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String brand;
    String seriesNumber;
    double price;

    Product(String brand, String seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand\t\t\t: " + brand);
        System.out.println("Series Number\t\t: " + seriesNumber);
        System.out.println("Price\t\t\t: " + price);
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, String seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size\t\t: " + screenSize);
        System.out.println("Storage Capacity\t: " + storageCapacity);
        System.out.println("----------------------------------------------------------");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String brand, String seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution\t\t: " + resolution);
        System.out.println("Lens Type\t\t: " + lensType);
        System.out.println("----------------------------------------------------------");
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, String seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram Size\t\t: " + ramSize);
        System.out.println("Processor Type\t\t: " + processorType);
        System.out.println("----------------------------------------------------------");
    }
}

public class ElectronicStore {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> products = new ArrayList<>();

    public static void displayMenu() {
        System.out.println("\n========================== MENU ==========================");
        System.out.println("1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar");
    }

    public static int getUserChoice() {
        int choice;
        try {
            System.out.print("\n>>> Pilih Menu\t: ");
            choice = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid Input...");
            choice = -1;
        }
        return choice;
    }

    public static void addProduct() {
        System.out.println("===================== Tambah Produk ======================");
        System.out.print("Masukkan Nama Produk  : ");
        String brand = sc.nextLine();
        System.out.print("Masukkan Nomor Seri   : ");
        String seriesNumber = sc.nextLine();
        System.out.print("Masukkan Harga        : ");
        double price = sc.nextDouble();
        sc.nextLine();

        int productType;
        do {
            System.out.println("==================== Pilih Tipe Produk ===================");
            System.out.println("1. Smartphone\n2. Camera\n3. Laptop");
            System.out.print("Pilih tipe produk\t: ");
            productType = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------------------------");
        } while (productType < 1 || productType > 3);

        switch (productType) {
            case 1:
                System.out.print("Masukkan Ukuran Layar             : ");
                double screenSize = sc.nextDouble();
                sc.nextLine();
                System.out.print("Masukkan Kapasitas Penyimpanan    : ");
                int storageCapacity = sc.nextInt();
                sc.nextLine();
                System.out.println("----------------------------------------------------------");
                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.print("Masukkan Resolusi     : ");
                int resolution = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Tipe Lensa   : ");
                String lensType = sc.nextLine();
                System.out.println("----------------------------------------------------------");
                products.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            case 3:
                System.out.print("Masukkan Ukuran RAM       : ");
                int ramSize = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Tipe Prosesor    : ");
                String processorType = sc.nextLine();
                System.out.println("----------------------------------------------------------");
                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            default:
                System.out.println("Invalid Product Type...");
        }
        System.out.print("Produk Berhasil Ditambahkan!");
    }

    public static void displayAllProduct() {
        System.out.println("\n====================== DAFTAR PRODUK =====================");
        if (products.isEmpty()) {
            System.out.println("No Products Found");
        } else {
            for (Product product : products) {
                product.displayInfo();
            }
        }
    }

    public static void purchaseProduct() {
        System.out.println("======================= BELI PRODUK ======================");
        if (products.isEmpty()) {
            System.out.println("Tidak Ada Produk Yang Tersedia!");
        } else {
            System.out.println("Produk Tersedia!");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i).brand + " " + products.get(i).seriesNumber);
            }
            System.out.print("Pilih Produk: ");
            int pilihan = getUserChoice();
            if (pilihan >= 1 && pilihan <= products.size()) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Pembelian Berhasil!");
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Invalid Product Number!");
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayAllProduct();
                    break;
                case 3:
                    purchaseProduct();
                    break;
                case 4:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Terima Kasih Telah Menggunakan Layanan Kami. Sampai Jumpa!");
                    System.out.println("----------------------------------------------------------");
                    break;
                default:
                    System.out.println("Invalid Input...");
            }
        } while (choice != 4);
    }
}