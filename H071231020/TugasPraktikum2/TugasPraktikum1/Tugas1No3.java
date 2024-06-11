package TugasPraktikum1;
import java.util.Scanner;

public class Tugas1No3 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Tanggal-Bulan-Tahun : ");
        String tgl = inputan.nextLine();  // Membaca input tanggal-bulan-tahun dari pengguna
        inputan.close();  // Menutup scanner

        // Memanggil fungsi konversiTanggal() untuk mengonversi format tanggal
        String outan = konversiTanggal(tgl);

        // Menampilkan hasil konversi tanggal
        System.out.println("Output : " + outan);
    }
    
    // Fungsi untuk mengonversi format tanggal
    public static String konversiTanggal(String input) {
        // Memisahkan input menjadi bagian-bagian: tanggal, bulan, tahun
        String[] bagian = input.split("-");
        String tanggal = bagian[0];
        String bulan = bagian[1];
        String tahun = bagian[2];
    
        // Konversi kode bulan menjadi nama bulan
        String Nama_Bulan;
        switch (bulan) {
            // Konversi kode bulan menjadi nama bulan sesuai dengan format
            case "01":
                Nama_Bulan = "Januari";
                break;
            case "02":
                Nama_Bulan = "Februari";
                break;
            case "03":
                Nama_Bulan = "Maret";
                break;
            case "04":
                Nama_Bulan = "April";
                break;
            case "05":
                Nama_Bulan = "Mei";
                break;
            case "06":
                Nama_Bulan = "Juni";
                break;
            case "07":
                Nama_Bulan = "Juli";
                break;
            case "08":
                Nama_Bulan = "Agustus";
                break;
            case "09":
                Nama_Bulan = "September";
                break;
            case "10":
                Nama_Bulan = "Oktober";
                break;
            case "11":
                Nama_Bulan = "November";
                break;
            case "12":
                Nama_Bulan = "Desember";
                break;
            default:
                Nama_Bulan = "Bulan tidak valid"; // Menampilkan pesan jika kode bulan tidak valid
        }
        
        // Konversi tahun menjadi format yang benar
        int Dig_Tahun = Integer.parseInt(tahun);
        if (Dig_Tahun >= 0 && Dig_Tahun <= 25) {
            tahun = "20" + tahun;
        } else if (Dig_Tahun >= 26 && Dig_Tahun <= 99) {
            tahun = "19" + tahun;
        }

        // Menggabungkan bagian-bagian yang telah dikonversi menjadi format tanggal yang benar
        String output = tanggal + " " + Nama_Bulan + " " + tahun;
        return output;  // Mengembalikan hasil konversi
    }
}
