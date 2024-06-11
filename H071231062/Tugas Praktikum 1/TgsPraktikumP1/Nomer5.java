package TgsPraktikumP1;
import java.util.*;

public class Nomer5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Numb = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Masukkan Angka : ");
        int bilangan = input.nextInt();
        input.close();
        //boolean find = false;
        try {
            for (int i = 0; i < Numb.length; i++) {
                for (int j = 0; j < Numb[i].length; j++) {
                    if (Numb[i][j] == bilangan ) {
                        System.out.print("Found" +" "+ bilangan +" " + "at [" + i + "][" + j + "]");
                        return;
                    }
                }
            }
            
            
        }catch (Exception e){
            System.out.print("Inputan Harus Berupa angka");
        }
    }   

}
