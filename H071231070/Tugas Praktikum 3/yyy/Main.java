public class Main { //class main untuk menjalankan programnya
    public static void main(String[] args) {
        armorWeaponListInfo(); //dipanggil untuk mendapatkan list armor sama waeponnya

        // Membuat objek pemain 1
        PUBG player1 = new PUBG("ziacavein", "Diamond", 100); // ini constructor kedua yang kumaksud tadi, ko buat objek baru namanya player1 trus dimasukkan nilainya ke dalam kurung 
        player1.weaponAndArmorList(2,3); // untuk memilih senjata sama armor, player1, artinya miliknya player1

        // Menampilkan info pemain 1
        System.out.println("========== Info Player ==========");
        player1.getPinfo(); // memanggil info player1
        
        // Membuat objek pemain 2
        PUBG enemy = new PUBG(); //ini gunanya constructor default, disini buat objek baru untuk enemy
        enemy.setName("enemy"); //method setter untuk mengatur atributnya enemy
        enemy.setRank("Gold");
        enemy.setHealth(100);
        enemy.weaponAndArmorList(3,1); 


        // Menampilkan info enemy
        System.out.println("========== Info Enemy ==========");
        enemy.getPinfo();

        // Memulai pertarungan antara kedua pemain
        System.out.println("\nPertarungan Dimulai!");
        player1.mulaiPertarungan(enemy); //player1 lawan enemy
    }

    public static void armorWeaponListInfo() { // ini method static, artinya nda perlu inisialisasi objek baru untuk panggil ini method
        System.out.println("=========== Weapon List ==========");
        System.out.println("1. M416");
        System.out.println("2. AKM");
        System.out.println("3. UMP");
        System.out.println("========== Armor List ============");
        System.out.println("1. Level 1");
        System.out.println("2. Level 2");
        System.out.println("3. Level 3");
    }

}

