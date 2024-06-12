import java.util.Arrays;

// Kelas utama untuk menjalankan program
class No2 {
    public static void main(String[] args) {
        // Membuat objek TypeRacer baru
        TypeRacer typeRacer = new TypeRacer();

        // Mengatur kata baru untuk diketik
        typeRacer.setNewWordsToType();
        System.out.println("|| text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        // Membuat array untuk menyimpan objek Typer
        Typer[] typers = new Typer[3];

        // Membuat objek Typer baru dengan nama dan kecepatan mengetik, dan menambahkannya ke array
        typers[0] = new Typer("Decade", 80, typeRacer);
        typers[1] = new Typer("Zi-O", 72, typeRacer);
        typers[2] = new Typer("Legend", 70, typeRacer);

        // Menambahkan semua objek Typer ke dalam daftar peserta lomba di TypeRacer
        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));
        // Memulai lomba mengetik
        typeRacer.startRace();
    }
}
