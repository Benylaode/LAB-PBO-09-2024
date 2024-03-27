import java.util.Scanner;

public class Tugas003b {
    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Masukkan tanggal lahir: ");
            String inputTanggal = scanner.nextLine();
            
            String[] tanggalSplit = inputTanggal.split("-");
            
            int hari = Integer.parseInt(tanggalSplit[0]);
            int bulan = Integer.parseInt(tanggalSplit[1]);
            int tahun = Integer.parseInt(tanggalSplit[2]);
            
    
            String namaBulan = " ";
                if(bulan <= 12) {
                    switch (bulan) {
                        case 1:
                            namaBulan = "Januari"; break;
                        case 2:
                            namaBulan = "Februari"; break;
                        case 3:
                            namaBulan = "Maret"; break;
                        case 4:
                            namaBulan = "April"; break;
                        case 5:
                            namaBulan = "Mei"; break;
                        case 6:
                            namaBulan = "Juni"; break;
                        case 7:
                            namaBulan = "Juli"; break;
                        case 8:
                            namaBulan = "Agustus"; break;
                        case 9:
                            namaBulan = "September"; break;
                        case 10:
                            namaBulan = "Oktober"; break;
                        case 11:
                            namaBulan = "November"; break;
                        case 12:
                            namaBulan = "Desember"; break;
                    }
                    
            int newYear = tahun < 100 ? (tahun < 30 ? 2000 + tahun : 1900 + tahun) : tahun;
            System.out.println(hari + " " + namaBulan + " " + newYear);                          
                }else {
                    System.out.println("Bulan tidak valid!");
                    
                }

            scanner.close();
    }
}