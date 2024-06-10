import java.util.Scanner;
/**
 * soal_02
 */
public class soal_02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Judul Film: ");
        String kalimat = input.nextLine();
        String kalimat_kapital = ubahkapital(kalimat);

        System.out.println(kalimat_kapital);

        input.close();
    }

    public static String ubahkapital(String kalimat) {
        String[] kalimat_array = kalimat.split("\\s+");
        StringBuilder hasil = new StringBuilder();

        for (String string : kalimat_array) {
            String hurutPertama = string.substring(0,1).toUpperCase();
            String sisaHuruf = string.substring(1);

            String hasilString = hurutPertama + sisaHuruf;
            hasil.append(hasilString).append(" ");

        }

        return hasil.toString();

}}