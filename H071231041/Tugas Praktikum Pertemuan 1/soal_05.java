import java.util.Scanner;

public class soal_05 {
    public static void main(String[] args) {
        try {
            int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan angka yang ingin dicari: ");
            int angka = input.nextInt();
            
            String temukan = found(nums, angka);
            System.out.println(temukan);
            
            input.close();
        } 
        
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Inputan bukan angka. Silahkan masukkan angka ");
        }
    }

    public static String found(int[][] nums, int angka) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == angka) {
                    String hasil = "Found " + angka + " at " + "[" + i + "]" + "["+ j + "]";
                    return hasil;
                }
            }
        }
        return "Angka " + angka + " tidak Ditemukan";
}
}