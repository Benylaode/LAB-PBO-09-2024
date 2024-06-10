package Pertemuan5.Nomor2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> listProduk = new ArrayList<>();
    public static void main(String[] args){
        Menu();

    }

    public static void Menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar\n");
        System.out.print(">>> Pilih Menu (1-4) : ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                AddProduct();
                Menu();
                break;
            case 2:
                System.out.println("Daftar Produk: ");
                for (Product x : listProduk){
                    x.displayInfo();
                    System.out.println("");
                }
                Menu();
                break;
            case 3:
                System.out.print("Masukkan nomor seri produk yang ingin dibeli : ");
                int searchNomorSeri = input.nextInt();
                int ada = -1;
                for (Product x : listProduk){
                    if (x.seriesNumber == searchNomorSeri){
                        ada = searchNomorSeri;
                        System.out.println("Berhasil Membeli Produk!");
                        x.displayInfo();
                        break;
                    }
                }
                if (ada == -1){
                    System.out.println("Produk tidak ada");
                }
                Menu();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                System.exit(1);
            default:
                Menu();
        }

    }

    public static void AddProduct(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama produk : ");
        String produk = input.nextLine();
        System.out.print("Masukkan nomor seri : ");
        int nomorSeri = input.nextInt();
        System.out.print("Masukkan harga : ");
        double harga = input.nextDouble();
        pilihTipe(produk, nomorSeri, harga);
    }
    public static void pilihTipe(String namaProduk, int nomorSeri, double harga){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih tipe produk: \n1. Smartphone\n2. Laptop\n3. Camera");
        System.out.print("Pilih tipe produk (1-3) : ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Masukkan ukuran layar (inci) : ");
                double screenSize = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan kapasitas penyimpanan (GB) : ");
                int storageCapacity = input.nextInt();
                input.nextLine();
                Smartphone smartphone = new Smartphone(namaProduk, nomorSeri, harga, screenSize, storageCapacity);
                listProduk.add(smartphone);
                break;
            case 2:
                System.out.print("Masukkan size ram (GB) : ");
                int ramSize = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan tipe prosesor cpu : ");
                String processorType = input.nextLine();
                Laptop laptop = new Laptop(namaProduk, nomorSeri, harga, ramSize, processorType);
                listProduk.add(laptop);
                break;
            case 3:
                System.out.print("Masukkan resolusi kamera : ");
                int resolusi = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan tipe lensa : ");
                String lensType = input.nextLine();
                Camera camera = new Camera(namaProduk, nomorSeri, harga, resolusi, lensType);
                listProduk.add(camera);
                break;
            
        }
    }
}
