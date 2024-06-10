
public class Main {
    public static void main(String[] args) {
        armorWeaponListInfo();

        
        PUBG player1 = new PUBG("Player", "Diamond", 100);

    

        player1.weaponAndArmorList(2,3); 

        
        System.out.println("========== Info Player ==========");
        player1.getPinfo();

        
        
        
        PUBG enemy = new PUBG();
        enemy.setName("enemy");
        enemy.setRank("Gold");
        enemy.setHealth(100);
        enemy.weaponAndArmorList(1,1); 


        
        System.out.println("========== Info Enemy ==========");
        enemy.getPinfo();

        
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

