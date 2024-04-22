
public class Main {
    public static void main(String[] args) {
        armorWeaponListInfo();

        // Membuat objek pemain 1
        PUBG player1 = new PUBG("Player", "Diamond", 100);

    

        player1.weaponAndArmorList(2,3); // Memilih M416 dan Armor Level 2

        // Menampilkan info pemain 1
        System.out.println("========== Info Player ==========");
        player1.getPinfo();

        
        
        // Membuat objek pemain 2
        PUBG enemy = new PUBG();
        enemy.setName("enemy");
        enemy.setRank("Gold");
        enemy.setHealth(100);
        enemy.weaponAndArmorList(1,1); // Memilih AKM dan Armor Level 3


        // Menampilkan info pemain 2
        System.out.println("========== Info Enemy ==========");
        enemy.getPinfo();

        // Memulai pertarungan antara kedua pemain
        System.out.println("\nPertarungan Dimulai!");
        player1.mulaiPertarungan(enemy);
    }

    public static void armorWeaponListInfo() {
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

