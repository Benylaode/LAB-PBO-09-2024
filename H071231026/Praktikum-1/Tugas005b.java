import java.util.Scanner;

public class Tugas005b {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 2}, {7, 8, 9}};
        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukkan Nilai yang ingin dicari : ");
        try {
            int angka = nilai.nextInt();
            boolean ditemukan = false; 

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == angka) {
                        System.out.printf("Found %d at [%d][%d]%n", angka, i, j);
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) {
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Nilai yang anda input tidak ditemukan");
            }

            nilai.close();
        } catch (Exception e) {
            System.out.println("Inputan Bukan Angka");
        }
    }
}
