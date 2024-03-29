import java.util.Scanner;
    
public class java1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //inp utk menerima input dari pengguna melalui konsol System.in
        try{ // untuk try catch digunakan untuk menangani pengecualian yg mungkin terjadi saat program berjalan.
            System.out.print("Masukkan jumlah bilangan: ");
            int n = inp.nextInt();

            int desimal = 0;// simpan bilangan bulat dan desimal
            int bulat = 0;

            System.out.print("Masukkan bilangan : ");// digunakan karena indeks dimulai dari 0
            for (int i = 0; i < n; i++) { //looping sebanyak n untuk memasukkan setiap bilangan
                float num = inp.nextFloat(); // membaca bilangan yang dimasukkan dan disimpan dalam variabel num

                if (num % 1 == 0) { // memriksa apakah bilangan yg dimasukan adalah bilangan bulat atau bilangan desimal.jika modulus dari bilangan tersebut 1 adalah 0. maka itu adalah bilangan bulat
                    bulat++; // menambahkan jumlah bilangan bulat atau desimal tergantung pada kondisi yg dipenuhi
                } else {
                    desimal++;
                }
            }
            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");
            inp.close(); // menutup objek Scanner setelah selesai penggunaan.
        }catch (Exception e) {
            System.out.println("Hanya bisa menerima angka");
        }
    }
}