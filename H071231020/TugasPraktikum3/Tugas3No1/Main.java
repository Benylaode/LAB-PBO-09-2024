package TugasPraktikum3.Tugas3No1;

public class Main {
    // Metode untuk menampilkan garis pembatas
    public static void line() {
        System.out.print("======================================================================");
    }

    public static void main(String[] args) {
        // Membuat senjata dan karakter player1
        Weapon w1 = new Weapon("Pegasus Fury", 500);
        Legend player1 = new Legend("Pegasus", 1000, 1, 2);
        
        // Membuat senjata dan karakter player2
        Weapon w2 = new Weapon("Celestial Storm");
        w2.setAttackPower(800);
        Legend player2 = new Legend("Orion", 1000, 1, 3);

        // Memasang senjata pada karakter
        player1.equipWeapon(w1);
        player2.equipWeapon(w2);

        // Menampilkan karakter player1 dan player2
        line();
        player1.display();
        player2.display();

        // Player1 menyerang player2
        player1.attack(player2);

        // Player1 bergerak ke posisi 3
        player1.setPosition(3);
        player1.movePosition();

        // Player1 menyerang player2 lagi
        player1.attack(player2);
        
        // Menampilkan informasi player2 setelah diserang
        player2.displayAfterAttack();

        // Player2 menyerang player1
        player2.attack(player1);

        // Menampilkan informasi player1 setelah diserang
        player1.displayAfterAttack();

        // Menampilkan informasi tentang kemenangan atau kekalahan
        player1.winLoseInfo(player2);

        // Player1 naik level
        player1.levelUp();

        // Menampilkan informasi player1 setelah naik level
        player1.display();

        // Player1 menyerang player2 lagi
        player1.attack(player2);

        // Menampilkan informasi tentang kemenangan atau kekalahan setelah serangan terakhir
        player1.winLoseInfo(player2);
    }
}
