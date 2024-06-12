package TgsPraktikumP1;

import java.util.*;

public class Nomer1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan :");
        int n = inputan.nextInt();
        inputan.nextLine();
        
        int bulat = 0;
        int desimal = 0;
        
         try {
            System.out.print("Masukkan " + n + " bilangan : ");
            String bil = inputan.nextLine();
            String[] angka = bil.split(" ");
                        
            
            for (String angbaru : angka) {
                int nums = Integer.parseInt(angbaru);
                if(nums % 1 == 0){
                    bulat++;
                 }
                 else {
                    desimal++;

                }
                 
                
            }
            System.out.println(bulat + " Bilangan bulat");
            System.out.println(desimal + " Bilangan Desimal");
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");
            
        }
        
        
        inputan.close();
    }
}
