
import java.util.Scanner;

public class Keluarga {
    boolean statusMenikah;
    String cekNikah;

    Scanner scanner = new Scanner(System.in);

    void cekMenikah() {
        System.out.print("Masukkan status menikah (Y/N): ");
        cekNikah = scanner.nextLine();

        if (cekNikah.equals("Y")) {
            statusMenikah = true;
        } else {
            statusMenikah = false;
        }
    }
}
