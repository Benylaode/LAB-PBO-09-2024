package TgsPraktikumP1;
import java.util.Scanner;

public class Nomer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, luas;
        double PI = Math.PI;
        try{
            System.out.print("Masukkan Jari jari Lingkaran : ");
            r = input.nextDouble();
            input.close();
        
        }catch (Exception e){
            System.out.print("Inputan harus berupa angka!");
            return;
        }
        luas = PI * r * r;
        System.out.printf("Luas lingkaran : %.2f", luas);
    }
}
