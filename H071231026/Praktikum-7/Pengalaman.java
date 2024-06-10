import java.util.InputMismatchException;

public class Pengalaman extends Kehidupan {

    int pengalaman;

    public Pengalaman(String nama, int gaji, int pengalaman) {
        super(nama, gaji);
        this.pengalaman = pengalaman;
    }

    public Pengalaman(String nama, int gaji) {
        super(nama, gaji);
    }

    public Pengalaman() {
    }

    @Override
    public void prosesKehidupan() {
        if (pengalaman == 1) {
            System.out.println("Freelancer");
        } else if (pengalaman == 2) {
            System.out.println("Magang");
        } else if (pengalaman == 3) {
            System.out.println("Kerja tetap");
        } else if (pengalaman == 4) {
            System.out.println("Tidak Ada");
        }

    }

    public void organisasi() {
        System.out.print("Pengalaman Organisasi (Jika tidak ada ketik 'Tidak Ada'): ");
        String organisasi = sc.nextLine();
        if (organisasi.equalsIgnoreCase("Tidak Ada")) {
            this.nilaiPlus = 0;
        } else {
            this.nilaiPlus = 1;
        }

    }

    public static void isiPengalaman() {
        System.out.println("Pengalaman sebelumnya :");
        System.out.println("1. Freelance");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja Tetap");
        System.out.println("4. Tidak Ada");
        System.out.print("input : ");
    }

    public void pengalamanKerja() {
        boolean hentikan = false;
        while (!hentikan) {
            try {
                boolean a = false;
                while (!a) {
                    Pengalaman.isiPengalaman();
                    this.pengalaman = sc.nextInt();
                    sc.nextLine();

                    if (pengalaman >= 1 && pengalaman <= 3) {
                        this.nilaiPlus = 1;
                        System.out.print("Gaji Sebelumnya : ");
                        this.gaji = sc.nextInt();
                        sc.nextLine();
                        hentikan = true;
                        a = true;
                    } else if (pengalaman == 4) {
                        this.nilaiPlus = 0;
                        hentikan = true;
                        a = true;


                    } else {
                        System.out.println("Pilihan hanya dari 1-4");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Inputan Hanya Menerima Angka");
                sc.nextLine();
            }
        }
    }

    public int getPengalaman() {
        return pengalaman;
    }

}