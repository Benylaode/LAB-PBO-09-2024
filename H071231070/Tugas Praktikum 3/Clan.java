public class Clan {
    String name, leader;
    int jumlahanggota;

    public Clan(){
        
    }
    
    public Clan(String name, String leader, int jumlahanggota) {
        this.name = name;
        this.leader = leader;
        this.jumlahanggota = jumlahanggota;
    }
    public void getclanInfo(){
        System.out.println("========== Info Clan ==========");
        System.out.println("Nama Clan: " + getName());
        System.out.println("Nama Leader: " + getLeader());
        System.out.println("Jumlah Anggota: " + getJumlahanggota());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLeader() {
        return leader;
    }
    public void setLeader(String leader) {
        this.leader = leader;
    }
    public int getJumlahanggota() {
        return jumlahanggota;
    }
    public void setJumlahanggota(int jumlahanggota) {
        this.jumlahanggota = jumlahanggota;
    }
    
}
