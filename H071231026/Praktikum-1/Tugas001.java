import java.util.Scanner;

public class Tugas001 {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        int angka = bilangan.nextInt();

        System.out.print("Masukkan n Bilangan : ");

        int bilBulat = 0;
        int bilDesimal = 0;

        for (int i = 0; i < angka; i++) {
            try {
                double angka2 = bilangan.nextDouble();
                if (angka2 % 1 == 0) {
                    bilBulat++;
                } else {
                    bilDesimal++;
                } 
            } catch (Exception e) {
                    System.out.println("Inputan hanya menerima angka!");
                    i--;
                    bilangan.nextLine();
                }
            }

            System.out.println(bilBulat + " Bilangan Bulat");
            System.out.println(bilDesimal + " Bilangan Desimal");

            bilangan.close();
        }
    } 