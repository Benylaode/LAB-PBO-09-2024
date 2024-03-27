import java.util.Scanner;

public class soal_04 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input jari-jari: ");
            float jari_jari = input.nextFloat();
            
            String luas = luas_lingkaran(jari_jari);
            
            System.out.println(luas);
    
            input.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Input tidak valid!!!");
        }
        
    }
    
    public static String luas_lingkaran(float jari_jari) {
        double hitung_luas = Math.PI * jari_jari * jari_jari;
        String hasil = String.format("%.2f", hitung_luas);

        return hasil;
    }
}
