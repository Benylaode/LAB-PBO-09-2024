package materi;
abstract class Kehidupan  {
    abstract void prosesKehidupan();
}
class Pendidikan extends Kehidupan {
    String pendidikan;

    public Pendidikan(String pendidikan){
        this.pendidikan = pendidikan;
    }
    @Override
    void prosesKehidupan() {
        System.out.println("Riwayat pendidikan: " + getPendidikan());
    }
    public String getPendidikan() {
        return pendidikan;
    }
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }
    
}
class Pengalaman extends Kehidupan{
    int pengalaman;
  
    public int getPengalaman() {
        return pengalaman;
    }

    public Pengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Pengalaman kerja: "+ getPengalaman());
    }

    public void setPengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }
}
class Projek extends Kehidupan {
    int projekk;
    public Projek(int projekk) {
            this.projekk = projekk;
    }
    public int getProjek() {
        return projekk;
    }
    public void setProjek(int projekk) {
        this.projekk = projekk;
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah Memiliki Projek");
    }
    
    public void jumlahProjek(){
        if(this.projekk == 1){
            System.out.println("Jumlah Projek IT: 4");
        }else if(this.projekk == 2){
            System.out.println("Jumlah Projek IT: 8");
        }else if(this.projekk == 3){
            System.out.println("Jumlah Projek IT: 12");
        }else if(this.projekk == 4){
            System.out.println("Jumlah Projek IT: 15");
        }else{}
    }
}
