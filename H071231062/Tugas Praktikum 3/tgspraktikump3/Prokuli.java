package tgspraktikump3;

public class Prokuli {
    String nama;
    Kuli Kuli = new Kuli();
    int boostingan;
    

    public Prokuli(String nama, String asalkuli, int boostingan){
        this.nama = nama;
        this.Kuli.asal = asalkuli;
        //this.Kuli.power = powerkuli;
        this.boostingan = boostingan;
        Kulijawa(asalkuli);
    }
    public Prokuli(){
        
    }

    public void Kulijawa(String asalkuli) {
        this.Kuli.asal = asalkuli;
        if ("Jawa".equals(asalkuli)) {
            this.Kuli.power = 100;
        }else{
            this.Kuli.power = 50;
        }
    }

    public void boostingan(int tambahanpower) {
        this.Kuli.power += tambahanpower;
        
        //if("Jawa".equals(this.Kuli.asal)) {
            System.out.println(this.nama + " mendapatkan tambahan " + tambahanpower + " power!");
        //}else{
            //System.out.println(lawanKuli.getnama() + " mendapatkan tambahan " + tambahanpower + " power! ");
        //}
    }

    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }

    public Kuli getKuli(){
        return Kuli;
    }
    public void setKuli(Kuli Kuli){
        this.Kuli = Kuli;
    }

    public int getboostingan(){
        return boostingan;
    }
    public void setboostingan(int boostingan){
        this.boostingan = boostingan;
    }

    /*public void cekstatus(){
        System.out.println("Inpo nama mas : " + this.getnama());
        System.out.println("Asal mana mas : " + this.getKuli().getasal());
        System.out.println("Seberapa greget loe : " + this.getKuli().getpower());
        System.out.println("+1" + this.getboostingan());
    }*/

    public void adupasheng(Prokuli lawanKuli) {
        System.out.println("adu pasheng antara " + this.getKuli().getasal() +" dengan power " + this.getKuli().getpower() +  " VS " +  lawanKuli.getKuli().getasal() + " dengan power " + lawanKuli.getKuli().getpower());
        
        String hasil = "HASILNYA ADALAH : ";

        if (this.getKuli().getpower() > lawanKuli.getKuli().getpower()) {
            hasil += this.getnama() + " WIN! ";
        }else if (this.getKuli().getpower() < lawanKuli.getKuli().getpower()){
            hasil += lawanKuli.getKuli().getasal() + " WIN!! ";
        } else {
            hasil += " Sama kuwat pemirsa ";
        }

        System.out.println(hasil);
    }
    
}
