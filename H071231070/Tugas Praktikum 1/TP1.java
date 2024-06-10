import java.util.Scanner;  

public class TP1 { 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int jumlahBilanganBulat = 0, jumlahBilanganDesimal = 0, jumlahHuruf = 0; 
        int x = input.nextInt(); 

        for (int i = 0; i < x; i++){ 
            try { 
                try { 
                    int angka = input.nextInt();
                    jumlahBilanganBulat++; 
                    angka = angka+1; 
                } catch (Exception e){
                    double angka = input.nextDouble();
                    angka = angka+1;
                    jumlahBilanganDesimal++; 
                }
            } catch (Exception e) {
                jumlahHuruf++; 
            }
        }
        input.close(); 
        if (jumlahHuruf == 0){   
            System.out.println(jumlahBilanganBulat + " Bilangan Bulat\n" + jumlahBilanganDesimal + " Bilangan Desimal");  
        } else {
            System.out.println(jumlahBilanganBulat + " Bilangan Bulat\n" + jumlahBilanganDesimal + " Bilangan Desimal\n" + jumlahHuruf + " Huruf/Karakter");
        }
    }
}
