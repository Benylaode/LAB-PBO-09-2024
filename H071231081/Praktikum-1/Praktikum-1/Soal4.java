import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        
        try {
            double jari_jari = input.nextDouble();
            double hasil = Math.PI * jari_jari * jari_jari;
            System.out.printf("Luas lingkaran dengan radius %.2f adalah: %.2f\n", jari_jari, hasil);
        } catch (Exception e) {
            System.out.println("Input yang Anda masukkan bukan angka.");
        } finally {
            input.close();
        }
    }
}