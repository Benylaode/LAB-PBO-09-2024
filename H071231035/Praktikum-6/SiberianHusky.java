package praktikum;

class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averagelength) {
        super(position, averagelength);
    }

    @Override
    public void move() {
        position += 2;
    }

    @Override
    void describe() {
        System.out.println("Siberian Husky adalah anjing yang indah dengan bulu yang tebal dan bulu kembar, yang berfungsi untuk melindungi mereka dari suhu dingin yang ekstrem. ");
        System.out.println("Siberian Husky dikenal karena sifat yang ramah, ceria, dan sangat sosial. ");
        System.out.println("Posisi Siberian Husky sekarang berada di angka "+position);
        System.out.println("Panjang rata-rata Siberian Husky adalah " + averagelength + " cm.");
        System.out.println();
    }
    
}
