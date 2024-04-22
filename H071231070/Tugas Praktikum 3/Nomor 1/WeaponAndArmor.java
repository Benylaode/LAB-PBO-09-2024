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




// public class Clan {
//     String name, leader;
//     int jumlahanggota;

//     public Clan(){
        
//     }
    
//     public Clan(String name, String leader, int jumlahanggota) {
//         this.name = name;
//         this.leader = leader;
//         this.jumlahanggota = jumlahanggota;
//     }
//     public void getclanInfo(){
//         System.out.println("========== Info Clan ==========");
//         System.out.println("Nama Clan: " + getName());
//         System.out.println("Nama Leader: " + getLeader());
//         System.out.println("Jumlah Anggota: " + getJumlahanggota());
//     }

//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getLeader() {
//         return leader;
//     }
//     public void setLeader(String leader) {
//         this.leader = leader;
//     }
//     public int getJumlahanggota() {
//         return jumlahanggota;
//     }
//     public void setJumlahanggota(int jumlahanggota) {
//         this.jumlahanggota = jumlahanggota;
//     }
    
// }

