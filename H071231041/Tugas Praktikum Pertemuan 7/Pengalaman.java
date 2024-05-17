import java.util.InputMismatchException;
import java.util.Scanner;

public class Pengalaman extends Kehidupan {
    int pekerjaan;
    int jumlahOrganisasi;
    Scanner scanner = new Scanner(System.in);

    @Override
    void prosesKehidupan() {

        throw new UnsupportedOperationException("Unimplemented method 'prosesKehidupan'");
    }

    void jumlahPekerjaanSebelumnya() {
        boolean inputMismatch = true;

        while (inputMismatch) {
            try {
                System.out.println("Pengalaman sebelumnya :");
                System.out.println("1. Freelancer");
                System.out.println("2. Magang");
                System.out.println("3. Pekerja tetap");
                System.out.println("4. Tidak ada");
                System.out.print("Input:");
                pekerjaan = scanner.nextInt();
                inputMismatch = false;
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak sesuai.");
                scanner.nextLine();
            }
        }
    }

    void jumlahOrganisasi() {
        boolean inputMismatch = true;

        while (inputMismatch) {
            try {
                System.out.print("Masukkan jumlah pengalaman berorganisasi sebelumnya:");
                jumlahOrganisasi = scanner.nextInt();
                inputMismatch = false;

                if (jumlahOrganisasi < 1) {
                    System.out.println("Tidak memenuhi syarat.");
                    System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.println("Masukkan input sesuai petunjuk.");
                scanner.nextLine();
            } finally {
                System.err.println(" ");
            }
        }
    }
}
