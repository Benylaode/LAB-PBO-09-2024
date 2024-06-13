import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int x = input.nextInt();
            int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
            
            boolean ditemukan = false; 
            
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == x) {
                        System.out.println("Found " + x + " at [" + i + "][" + j + ']');
                        ditemukan = true; 
                        break;
                    }
                }
                if (ditemukan) {
                    break; 
                }
            }
            
            if (!ditemukan) {
                System.out.println("Value " + x + " not found in the array."); // Pesan jika nilai tidak ditemukan
            }
        } catch (Exception e) {
            System.out.println("Input yang Anda masukkan bukan bilangan bulat.");
        } finally {
            input.close();
        }
    }
}