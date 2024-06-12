package TugasPraktikum3.Tugas3No1;

public class Weapon {
    String name;          // Nama senjata
    int attackPower;      // Kekuatan serangan senjata

    // Konstruktor untuk inisialisasi nama senjata
    Weapon(String name) {
        this.name = name;
    }

    // Konstruktor untuk inisialisasi nama senjata dan kekuatan serangan
    Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    // Setter untuk mengatur kekuatan serangan senjata
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Getter untuk mendapatkan kekuatan serangan senjata
    public int getAttackPower() {
        return attackPower;
    }
    
    // Metode untuk menampilkan informasi tentang senjata
    void display() {
        System.out.print("Weapon \t     : " + this.name + "\nWeapon Power : " + this.attackPower + "\n");
        line();  // Memanggil metode line() untuk menampilkan garis pembatas
    }

    // Metode untuk menampilkan garis pembatas
    public void line() {    
        System.out.print("======================================================================");
    }
}
