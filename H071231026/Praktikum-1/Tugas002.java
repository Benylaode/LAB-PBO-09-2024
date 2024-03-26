import java.util.Scanner;

public class Tugas002 {
    public static void main(String[] args) {
        Scanner testes = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
            String judul = testes.nextLine().trim();
            String[] words = judul.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ");
                } else {
                    System.out.println("Inputan kosong");
                }
            }
            testes.close();
        
    }
}
