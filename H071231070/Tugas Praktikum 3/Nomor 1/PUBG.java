public class PUBG {
    String name, rank;
    int damage;
    int health = 100;
    WeaponAndArmor weaponAndArmor = new WeaponAndArmor();

    public PUBG(){
        
    }

    public PUBG(int health, String name, String rank) {
        this.name = name;
        this.rank = rank;
        this.health = health;
    }
    public void getPinfo(){
        System.out.println("Nama Player    : " + getName());
        System.out.println("Rank Player    : " + getRank());
        System.out.println("Weapon         : " + weaponAndArmor.getSenjata());    
        System.out.println("Armor          : " + weaponAndArmor.getArmor());
        System.out.println("Total Health   : " + getHealth());
    }


    public void weaponAndArmorList(int pilihan1, int pilihan2) {
        if (pilihan1 == 1) {
            this.weaponAndArmor.setSenjata("M416");
            setDamage(35);
        } else if (pilihan1 == 2) {
            this.weaponAndArmor.setSenjata("AKM");
            setDamage(40);
        } else {
            this.weaponAndArmor.setSenjata("UMP");
            setDamage(15);
        }

        if (pilihan2 == 1) {
            this.weaponAndArmor.setArmor(30);
        } else if (pilihan2 == 2) {
            this.weaponAndArmor.setArmor(60);
        } else if (pilihan2 == 3) {
            this.weaponAndArmor.setArmor(100);
        } else {
            this.weaponAndArmor.setArmor(0);
        }
    }

    public void mulaiPertarungan(PUBG musuh) {
        while (this.health > 0 && musuh.health > 0) {
            
            this.attack(musuh);
            
            
            if (musuh.health > 0) {
                musuh.attack(this);
            }
        }
    
        
        if (this.health <= 0 && musuh.health <= 0) {
            System.out.println("Pertarungan berakhir imbang!");
        } else if (this.health <= 0) {
            System.out.println(this.name + " kalah dalam pertarungan melawan " + musuh.name);
        } else {
            System.out.println(musuh.name + " kalah dalam pertarungan melawan " + this.name);
        }
    }
    

    public void attack(PUBG target) {
        int kerusakanYangDiberikan = this.damage - target.weaponAndArmor.getArmor();
        if (kerusakanYangDiberikan < 0) {
            kerusakanYangDiberikan = 0; 
        }
        target.health -= kerusakanYangDiberikan;
        if (target.health < 0) {
            target.health = 0; 
        }
        
        this.setHealth(this.health);
        
        
        if (this.health <= 0 || target.health <= 0) {
            return;
        }
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health + weaponAndArmor.getArmor();
    } 
}
