import java.util.Scanner;
public class TP3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine(); 
        String[] pisah = tanggal.split("-"); 
        
        konversiString(pisah); 
        input.close();
    }
    static void konversiString(String[] hasil){
        int tanggal = Integer.parseInt(hasil[0]);  
        int bulanAwal = Integer.parseInt(hasil[1]); 
        int tahunAwal = Integer.parseInt(hasil[2]); 
        int tahun = CekTahun(tahunAwal); 
        
        String bulan = Validasi(bulanAwal, tanggal, tahun);   
        System.out.println(tanggal + " " + bulan + " " + tahun);
    }

    static String Validasi(int bulan, int tanggal, int tahun){
        String x = ""; 
        switch (bulan){
            case 1:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Januari";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 2:
                if (tanggal > 0 && tanggal <= 29){
                    if (tanggal == 29) {
                        if (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)){
                            x = "Februari";
                        } else {
                            System.out.println("Tanggal Tidak Valid!");
                            System.exit(1);
                        }
                    } else {
                        x = "Februari";
                    }
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 3:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Maret";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 4:
                if (tanggal > 0 && tanggal <= 30){
                    x = "April";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 5:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Mei";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 6:
                if (tanggal > 0 && tanggal <= 30){
                    x = "Juni";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 7:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Juli";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 8:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Agustus";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 9:
                if (tanggal > 0 && tanggal <= 30){
                    x = "September";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 10:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Oktober";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 11:
                if (tanggal > 0 && tanggal <= 30){
                    x = "November";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 12:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Desember";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
        }
        return x;
    }
    
    static int CekTahun(int tahun){
        if (tahun >= 40){
            return (1900 + tahun);
        } else {
            return (2000 + tahun);
        }
    }
}