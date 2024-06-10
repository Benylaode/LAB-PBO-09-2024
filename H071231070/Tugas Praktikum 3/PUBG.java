public class PUBG {
    String name, rank;
    int damage;
    int health = 100;

    public PUBG(){ 
    }

    public PUBG(String name, String rank, int damage, int health) {
        this.name = name;
        this.rank = rank;
        this.damage = damage;
        this.health = health;
    }
    public void getPinfo(){
        System.out.println("========== Info Player ==========");
        System.out.println("Nama Player: " + getName());
        System.out.println("Rank Player: " + getRank());
        System.out.println("damage Player: " + getDamage());    
    }


    public void mulaiPertarungan(PUBG musuh) {
        while (this.health > 0 && musuh.health > 0) {
            this.attack(musuh);
            if (musuh.health > 0) {  // Musuh attacks back if still alive
                musuh.attack(this);
            }
        }

        if (this.health <= 0) {
            System.out.println(this.name + " is defeated by " + musuh.name);
        } else if (musuh.health <= 0) {
            System.out.println(musuh.name + " is defeated by " + this.name);
        }
    }

    public void chooseWeapon(String senjata){
        if (senjata.equals("M416")) {
            setDamage(35);
        } else if (senjata.equals("AKM")) {
            setDamage(40);
        } else if (senjata.equals("UMP")) {
            setDamage(15);
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
        this.health = health;
    }  
}
