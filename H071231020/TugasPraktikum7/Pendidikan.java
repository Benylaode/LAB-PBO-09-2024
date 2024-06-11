import java.util.InputMismatchException;
import java.util.Scanner;

public class Pendidikan {
    String pendidikan;
    Scanner scanner = new Scanner(System.in);

    void cekPendidikan() {
        try {
            System.out.print("Pendididkan terakhir (SD/SMP/SMA/SMK/S1/S2/S3):");
            pendidikan = scanner.nextLine();
            if (pendidikan.equals("SMP")) {
                System.out.println("Tidak memenuhi syarat.");
                Main.playSound("rejected.wav");
            } else if (pendidikan.equals("SD")) {
                System.out.println("Tidak memenuhi syarat.");
                Main.playSound("rejected.wav");
            } else if (pendidikan.equals("SMA")) {
                System.out.println("Memenuhi syarat.");
            } else if (pendidikan.equals("S1")) {
                System.out.println("Memenuhi syarat.");
            } else if (pendidikan.equals("SMK")) {
                System.out.println("Memenuhi syarat.");
            } else if (pendidikan.equals("S2")) {
                System.out.println("Memenuhi syarat.");
            } else if (pendidikan.equals("S2")) {
                System.out.println("Memenuhi syarat.");
            } else if (pendidikan.equals("S3")) {
                System.out.println("Memenuhi syarat.");
            } else {
                System.out.println("Input tidak sesuai.");
                System.exit(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak sesuai.");
        }

    }

}
