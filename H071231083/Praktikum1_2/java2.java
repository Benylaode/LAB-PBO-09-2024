import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul :\n> ");
        String judul = input.nextLine(); //mengambil satu baris penuh dengan tipe data string
        System.out.println(hurufJudul(judul)); //memprint sebuah method bernama hurufjudul dengan parameter judul
        input.close();
    }
    static String hurufJudul(String judul) { //method yg mengembalikan nilai string dengan parameter betipe string
        String[] arrString = judul.split(" "); //array
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1); //saya mengindeks i=0 maka array[0] = "aku" setelah diakses aku diubah nilainya menjadi TopUpperCase merupakan method dari Character yg mengubah huruf kecil kebesar
        }
        String hasil = String.join(" ", arrString); // mengubah seluruh kata didalam array tersebut dan menyusun kembali dan menggabungkannya kembali. 
        return hasil;
    }
}