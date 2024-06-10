public class WeaponAndArmor {
    String senjata; 
    int armor, money;

    public WeaponAndArmor(){
    }

    public WeaponAndArmor(String senjata, int armor) {
        this.senjata = senjata;
        this.armor = armor;
    }

    public void getWeaponAndArmorInfo() {
        System.out.println("========== Armor & Weapon ==========");
        System.out.println("Senjata : " + getSenjata());
        System.out.println("Armor  : " + getArmor());
    }

    public String getSenjata() {
        return senjata;
    }
    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    
}





