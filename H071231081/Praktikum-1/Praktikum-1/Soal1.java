import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int angka, bilBulat = 0, bilDesimal = 0;

        while (true) {
            try {
                angka = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Masukkan angka valid.");
                input.next();
            }
        }

        for (int bil = 0 ; bil < angka ; bil++){
            try{
                if (input.hasNextDouble()){
                    double number = input.nextDouble();
                    if(number % 1 ==0){
                        bilBulat++;
                    } else {
                        bilDesimal++;
                    }
                } else {
                    throw new NumberFormatException("Input bukan angka");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                input.next();
                bil--; 
            }
        }input.close();
        System.out.println(bilBulat + " Bilangan Bulat");
        System.out.println(bilDesimal + " Bilangan Desimal");
    }
}