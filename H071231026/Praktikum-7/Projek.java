import java.util.InputMismatchException;

public class Projek extends Kehidupan {
    int jumlahProyek;

    public Projek(String nama, int gaj, int jumlahProyek) {
        super(nama, gaj);
        this.jumlahProyek = jumlahProyek;
    }

    public Projek() {

    }

    public static void isiProjek() {
        System.out.println("Projek IT :");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih Dari 15");
        System.out.print("Input : ");
    }

    @Override
    public void prosesKehidupan() {
        switch (jumlahProyek) {
            case 1:
                System.out.println("Jumlah projek IT : 4");
                break;
            case 2:
                System.out.println("Jumlah projek IT : 8");
                break;
            case 3:
                System.out.println("Jumlah projek IT : 12");
                break;
            case 4:
                System.out.println("Jumlah projek IT : Lebih Dari 15");
                break;
            default:
                break;
        }
    }

    public void jumlahProjek() {
        boolean hentikan = false;
        while (!hentikan) {
            try {
                boolean a = false;
                while (!a) {
                    Projek.isiProjek();
                    jumlahProyek = sc.nextInt();
                    sc.nextLine();

                    switch (jumlahProyek) {
                        case 1:
                            this.nilaiPlus = 0;
                            hentikan = true;
                            a = true;
                            break;
                        case 2:
                            this.nilaiPlus = 1;
                            hentikan = true;
                            a = true;
                            break;
                        case 3:
                            this.nilaiPlus = 1;
                            hentikan = true;
                            a = true;
                            break;
                        case 4:
                            this.nilaiPlus = 1;
                            hentikan = true;
                            a = true;
                            break;
                        default:
                            System.out.println("Pilihan hanya (1-4)!");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Inputan Hanya Menerima Angka");
                sc.nextLine();
            }

        }
    }
}