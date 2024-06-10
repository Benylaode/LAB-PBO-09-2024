import java.util.Scanner;

public class soal_03 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan tanggal (gunakan tanda (-) untuk memisahkan): ");
            String tanggal = input.nextLine();

            String konversi = konversi(tanggal);
            System.out.println(konversi);

            input.close();
        } catch (NumberFormatException e) {
            System.out.println("Inputan tanggal tidak valid! Pastikan hanya memasukkan angka untuk hari dan tahun.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Format tanggal tidak valid! Pastikan menggunakan format 'hari-bulan-tahun'.");
        } catch (IllegalArgumentException e) {
            System.out.println(" tidak valid !!!");
        }
    }

    public static String konversi(String tanggal) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        String[] tanggal_new = tanggal.split("-");

        int hari = Integer.parseInt(tanggal_new[0]);

        if (hari <= 0 || hari > 31) {
            System.out.print("Tanggal");
            throw new IllegalArgumentException();
        }
        
        String bulan = tanggal_new[1];
        switch (bulan) {
            case "01":
                bulan = "Januari";
                break;
            case "02":
                bulan = "Februari";
                break;
            case "03":
                bulan = "Maret";
                break;
            case "04":
                bulan = "April";
                break;
            case "05":
                bulan = "Mei";
                break;
            case "06":
                bulan = "Juni";
                break;
            case "07":
                bulan = "Juli";
                break;
            case "08":
                bulan = "Agustus";
                break;
            case "09":
                bulan = "September";
                break;
            case "10":
                bulan = "Oktober";
                break;
            case "11":
                bulan = "November";
                break;
            case "12":
                bulan = "Desember";
                break;
            default:
                System.out.print("Bulan");
                throw new IllegalArgumentException();
        }
        
        int tahun = Integer.parseInt(tanggal_new[2]);
        if (tahun < 50) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        String hasil = String.valueOf(hari) + " " + bulan + " " + String.valueOf(tahun);
        return hasil;
    }
}
