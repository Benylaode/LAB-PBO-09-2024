package Soal_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class sebagai titik masuk utama aplikasi
 */
class Main {
    static Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

    /**
     * Metode untuk menjalankan aplikasi
     */
    static void runApp() {
        while (true) { // Looping utama untuk menjalankan program
            try {
                // Menampilkan menu utama
                System.out.println("Menu:");
                System.out.println("1. Tambah Produk");
                System.out.println("2. Tampilkan Semua Produk");
                System.out.println("3. Beli Produk");
                System.out.println("4. Keluar");

                System.out.print(">>> Pilih menu (1-4): ");
                int pilihan = input.nextInt(); // Meminta pengguna memilih opsi menu

                switch (pilihan) {
                    case 1: // Opsi untuk menambahkan produk baru
                        // Meminta pengguna memasukkan detail produk
                        System.out.print("Masukkan nama produk: ");
                        input.nextLine(); // Membersihkan buffer
                        String product_name = input.nextLine();

                        System.out.print("Masukkan nomor seri: ");
                        int serial_number = input.nextInt();
                        input.nextLine(); // Membersihkan buffer

                        System.out.print("Masukkan harga: ");
                        double product_price = input.nextDouble();
                        input.nextLine(); // Membersihkan buffer

                        // Menampilkan opsi untuk memilih jenis produk
                        System.out.println("Pilih tipe produk: ");
                        System.out.println("1. Smartphone");
                        System.out.println("2. Laptop");
                        System.out.println("3. Camera");

                        System.out.print("Pilih tipe produk (1-3): ");
                        int pilihan2 = input.nextInt();
                        input.nextLine(); // Membersihkan buffer
                        switch (pilihan2) {
                            case 1: // Opsi untuk menambahkan smartphone
                                System.out.print("Masukkan ukuran layar (inci): ");
                                double inci = input.nextInt();
                                input.nextLine(); // Membersihkan buffer

                                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                                int storage = input.nextInt();
                                input.nextLine(); // Membersihkan buffer

                                // Membuat objek Smartphone dan menambahkannya ke daftar produk
                                Smartphone smartphone1 = new Smartphone(product_name, serial_number, product_price,
                                        inci, storage);
                                Product.listProduct.add(smartphone1);
                                break;
                            case 2: // Opsi untuk menambahkan laptop
                                System.out.print("Masukkan ukuran ram: ");
                                int ramSize = input.nextInt();
                                input.nextLine(); // Membersihkan buffer

                                System.out.print("Masukkan tipe prosesor: ");
                                String processorType = input.nextLine();

                                // Membuat objek Laptop dan menambahkannya ke daftar produk
                                Laptop laptop1 = new Laptop(product_name, serial_number, product_price, ramSize,
                                        processorType);
                                Product.listProduct.add(laptop1);
                                break;
                            case 3: // Opsi untuk menambahkan kamera
                                System.out.print("Masukkan resolusi kamera: ");
                                int resolution = input.nextInt();
                                input.nextLine(); // Membersihkan buffer

                                System.out.print("Masukkan tipe lensa: ");
                                String lens = input.nextLine();

                                // Membuat objek Camera dan menambahkannya ke daftar produk
                                Camera camera1 = new Camera(product_name, serial_number, product_price, resolution,
                                        lens);
                                Product.listProduct.add(camera1);
                                break;
                            default:
                                throw new InputMismatchException("Input tidak valid");
                        }
                        break;
                    case 2: // Opsi untuk menampilkan semua produk
                        Product.showAllProduct();
                        break;
                    case 3: // Opsi untuk membeli produk
                        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                        int pilihan3 = input.nextInt();

                        boolean isFound = false;

                        // Mencari produk berdasarkan nomor seri dan menampilkan informasi produk
                        for (int i = 0; i < Product.listProduct.size(); i++) {
                            if (Product.listProduct.get(i).getSeriesNumber() == pilihan3) {
                                isFound = true;
                                System.out.println("Anda telah membeli produk:");
                                Product.listProduct.get(i).displayInfo();
                                Product.listProduct.remove(i); // Menghapus produk dari daftar setelah dibeli
                            }
                        }

                        if (!isFound) {
                            System.out.printf("Product dengan nomor seri %d tersebut tidak ditemukan\n", pilihan3);
                        }
                        break;
                    case 4: // Opsi untuk keluar dari program
                        System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                        System.exit(0); // Keluar dari program
                    default:
                        throw new InputMismatchException("Input tidak valid.");
                }
            } catch (InputMismatchException e
            ) {
                // Tangani kesalahan masukan yang tidak valid
                System.err.println("Error: Input tidak valid. Mohon masukkan pilihan yang sesuai.");
                input.nextLine(); // Membersihkan buffer
            } catch (Exception e) {
                // Tangani kesalahan umum
                System.err.println("Error: Terjadi kesalahan tidak diketahui.");
            }
        }
    }

    /**
     * Metode utama untuk menjalankan program
     */
    public static void main(String[] args) {
        runApp(); // Panggil metode runApp() untuk menjalankan aplikasi
    }
}
