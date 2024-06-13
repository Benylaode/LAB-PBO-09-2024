import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        input.close();
        String[] format = tanggal.split("-");
        String hasil = "";
        try {
            int hari = Integer.parseInt(format[0]);
            hasil += hari + " ";
            switch(format[1]){
                case "01" : hasil += "Januari "; break;
                case "02" : hasil += "Februari "; break;
                case "03" : hasil += "Maret "; break;
                case "04" : hasil += "April "; break;
                case "05" : hasil += "Mei "; break;
                case "06" : hasil += "Juni "; break;
                case "07" : hasil += "Juli "; break;
                case "08" : hasil += "Agustus "; break;
                case "09" : hasil += "September "; break;
                case "10" : hasil += "Oktober "; break;
                case "11" : hasil += "November "; break;
                case "12" : hasil += "Desember "; break;
            }
            int tahun = Integer.parseInt(format[2]);
            if (tahun < 24){
            hasil += "20" + tahun;
        } else {
            hasil += "19" + tahun;
        }
    } catch (Exception e) {
       System.out.print("input tidak valid");
    }
        System.out.println(hasil);
    }
}