package TugasPraktikum3.Tugas3No1;


public class Legend {
    String name;        // Nama karakter
    int health;         // Kesehatan karakter
    int level;          // Level karakter
    int position;       // Posisi karakter di permainan
    Weapon weapon;      // Senjata yang digunakan oleh karakter

    // Konstruktor untuk inisialisasi atribut karakter
    Legend(String name, int health, int level, int position) {
        this.name = name;
        this.health = health <= 0 ? 0 : health;  // Jika kesehatan kurang dari atau sama dengan 0, maka kesehatan diatur menjadi 0
        this.level = level;
        this.position = position;
    }

    // Konstruktor alternatif untuk inisialisasi atribut karakter tanpa kesehatan
    Legend(String name, int level, int position) {
        this.name = name;
        this.level = level;
        this.position = position;
    }

    // Getter untuk mendapatkan nama karakter
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan kesehatan karakter
    public int getHealth() {
        return health <= 0 ? 0 : health;  // Jika kesehatan kurang dari atau sama dengan 0, maka kesehatan diatur menjadi 0
    }

    // Getter untuk mendapatkan level karakter
    public int getLevel() {
        return level;
    }

    // Getter untuk mendapatkan posisi karakter
    public int getPosition() {
        return position;
    }

    // Setter untuk mengatur posisi karakter
    public void setPosition(int position) {
        this.position = position;
    }

    // Metode untuk mengequip senjata kepada karakter
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Metode untuk menampilkan garis pembatas
    public void line() {
        System.out.print("======================================================================");
    }

    // Metode untuk menampilkan informasi lengkap tentang karakter
    public void display() {
        System.out.println("\nName         : " + this.getName());
        System.out.println("Health       : " + this.getHealth() + " HP");
        System.out.println("Level        : " + this.getLevel());
        System.out.println("Position     : " + this.getPosition());
        this.weapon.display();  // Menampilkan informasi tentang senjata yang digunakan
    }

    // Metode untuk menampilkan informasi setelah karakter melakukan serangan
    public void displayAfterAttack() {
        System.out.println("\nName                   : " + this.getName());
        System.out.println("Remaining Health       : " + this.getHealth() + " HP");
        line();
    }

    // Metode untuk menyerang karakter musuh
    void attack(Legend enemy) {
        if (this.getPosition() == enemy.getPosition()) {
            enemy.health -= this.weapon.getAttackPower();
            System.out.printf("\n%s menyerang %s...\n", this.getName(), enemy.getName());
            line();
            System.out.printf("\n%s menerima %d damage. Tersisa %d HP !\n", enemy.getName(), weapon.getAttackPower(), enemy.getHealth());
            line();

        } else {
            System.out.printf("\n%s dan %s berada di lane yang berbeda. Tidak bisa Adu Mekanik!\n", this.getName(), enemy.getName());
            line();
        }
    }

    // Metode untuk memindahkan posisi karakter
    public void movePosition() {
        this.setPosition(position);
        System.out.printf("\n%s bergerak ke posisi --> %d\n", this.getName(), position);
        line();
    }

    // Metode untuk meningkatkan level karakter
    public void levelUp() {
        this.level++;
        health += 200;
        System.out.printf("\n%s Naik level --> %d. HP meningkat!\n", this.getName(), this.getLevel());
        line();
    }

    // Metode untuk menampilkan informasi tentang kemenangan atau kekalahan
    public void winLoseInfo(Legend enemy) {
        if (this.getHealth() <= 0) {
            System.out.printf("\n%s telah dikalahkan. %s Menang!\n", this.getName(), enemy.getName());
            System.out.println(">>>>>>>STATUS<<<<<<<");
            System.out.println("\nName       : " + enemy.getName());
            System.out.println("Last Health  : " + enemy.getHealth() + " HP");
            System.out.println("Last Level   : " + enemy.getLevel());
            System.out.println("Last Position: " + enemy.getPosition());
            enemy.weapon.display();
            line();
        } else if (enemy.getHealth() <= 0) {
            System.out.printf("\n%s telah dikalahkan. %s Menang!\n", enemy.getName(), this.getName());
            line();
            System.out.println("\n>>>>>>>STATUS<<<<<<<");
            System.out.println("Name         : " + this.getName());
            System.out.println("Last Health  : " + this.getHealth() + " HP");
            System.out.println("Last Level   : " + this.getLevel());
            System.out.println("Last Position: " + this.getPosition());
            this.weapon.display();
        } else {
            System.out.println("\nBATTLE MASIH BERLANGSUNG!!!");
            line();
        }
    }
}
