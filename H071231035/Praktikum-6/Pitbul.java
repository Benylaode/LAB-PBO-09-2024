package praktikum;

class Pitbul extends Dog {

    public Pitbul(int position, int averagelength) {
        super(position, averagelength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    void describe() {
        System.out.println("Pitbul adalah anjing dengan tubuh yang berotot dan kuat.");
        System.out.println("Pitbull memiliki sifat yang penuh energi, percaya diri, dan setia kepada pemiliknya. ");
        System.out.println("Posisi pitbul sekarang berada di angka "+position);
        System.out.println("Panjang rata-rata pitbul adalah " + averagelength + " cm.");
        System.out.println();
    }
    
}
