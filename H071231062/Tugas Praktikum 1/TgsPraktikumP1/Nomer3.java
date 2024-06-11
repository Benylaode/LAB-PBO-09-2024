package TgsPraktikumP1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Nomer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal : ");
        String TWt = input.nextLine();

        String[] bagian = TWt.split("-");
        int hari = Integer.parseInt(bagian[0]);
        int bulan = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);

        LocalDate form = LocalDate.of(tahun, bulan, hari);
        String susuntgl = form.format(DateTimeFormatter.ofPattern("d MMMM yyyy",new Locale("id")));
        System.out.println(susuntgl);
       // System.out.println(form);

        input.close();
    }
}
