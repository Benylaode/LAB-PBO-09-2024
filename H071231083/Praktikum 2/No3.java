class Cuboid { //cuboid adalah bentuk 3 dimensi yg memiliki 6 sisi yg berbentuk persegi panjang
    double height;
    double width; //3 atribut yg masing" bertipe data double
    double length;

    double getVolume() { //kuboid menghitung dgn mengalikan tinggi, lebar dan panjangnya
        return height * width * length;
    }
}

public class No3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 3;
        cuboid.width = 30; // setelah objek kuboid dibuat, nilai" atributnya diatur dgn nilai tertentu
        cuboid.length = 50;
        System.out.printf("Volume = %.2f", cuboid.getVolume()); //dicetak dgn format 2 angka dibelakang koma
    }
}