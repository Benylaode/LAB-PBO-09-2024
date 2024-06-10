import java.util.Scanner;

public class soal_01 {
    public static void main(String[] args) {
        
        try {
            Scanner scannerInput = new Scanner(System.in);
            System.out.print("Masukkan jumlah angka: ");
    
            String n_String = scannerInput.next();

            int n = Integer.parseInt(n_String);
            int jumlahBulat = 0;
            int jumlahDesimal = 0;
    
            System.out.print("Masukkan angka: ");
            for (int i = 0; i < n; i++) {
                String angka = scannerInput.next();
                
                float angka_float = Float.parseFloat(angka);
                if (angka_float % 1 == 0) {
                    jumlahBulat += 1;
                }
                else {
                    jumlahDesimal += 1;
                }
            }
            
            System.out.println(jumlahBulat + " bilangan Bulat");
            System.out.println(jumlahDesimal + " bilangan Desimal");
            scannerInput.close();
            
        } 
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("Inputan salah. Silahkan masukkan angka");
        }
        
        
    }
}
