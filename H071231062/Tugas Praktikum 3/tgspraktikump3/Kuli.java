package tgspraktikump3;

public class Kuli {
    String asal;
    int power = 50;
    String nama;

    public static final String jenis = "Jawa";

    public Kuli(){
    }

    public void boostingan(int tambahanpower) {
        this.power += tambahanpower;
    }

    public Kuli(String asal, int power){
        this.asal = asal;
        this.power = power;
    }

    public String getasal(){
        return asal;
    }

    public void setasal(String asal){
        this.asal = asal;
    }

    public int getpower(){
        return power;
    }

    public void setpower(int power){
        this.power = power;
    }

    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
}




