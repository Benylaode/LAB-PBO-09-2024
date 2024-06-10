package praktikum;

class Bulldog extends Dog {
    public Bulldog(int position,int averagelength){
        super(position,averagelength);
    }
    @Override
    public void move() {
        position += 1;
    }

    @Override
    void describe() {
        System.out.println("Bulldog adalah anjing yang kuat dan berotot dengan tubuh yang pendek dan berat. ");
        System.out.println("Bulldog dikenal karena sifatnya yang tenang, setia, dan ramah.  ");
        System.out.println("Posisi Bulldog sekarang berada di angka "+position);
        System.out.println("Panjang rata-rata Bulldog adalah " + averagelength + " cm.");
        System.out.println();
    }
    
}
