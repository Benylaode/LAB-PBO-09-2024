public class WeaponAndArmor { // ini class weapon dan armor
    String senjata; //atributnya
    int armor;

    public void getWeaponAndArmorInfo() { // untuk mengambil weapon senjata
        System.out.println("========== Armor & Weapon ==========");
        System.out.println("Senjata : " + getSenjata());
        System.out.println("Armor  : " + getArmor());
    }

    // method setter dan getter
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