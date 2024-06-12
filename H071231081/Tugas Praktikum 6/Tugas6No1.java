abstract class Dog {
    int position;
    int averageLength;

    public abstract void move();

    public void describe() {
        System.out.println("Anjing!");
    }
}

interface Move {
    public void move();
}

class Pitbull extends Dog implements Move {
    public Pitbull() {
        this.position = 0;
        this.averageLength = 60;
    }

    @Override // untuk menurunkan fungsi method dari class induk
    public void move() {
        this.position += 3;
        System.out.println("1. - Anjing Pitbull berpindah posisi ke : " + position);
    }                           
                                
    @Override
    public void describe(){
        System.out.println("   - Ini adalah anjing Pitbull, Dia Bersifat Agresif, Patuh, Berani, Keras Kepala, Pengasih, dan Sangarrr");
        System.out.println("   - Jenis Anjing seperti ini biasa disebut American Bully, American PitBull Terrier, dll");
        System.out.println("   - Panjang rata rata anjing Pitbull adalah " + averageLength + "CM");    
    }
}

class SiberianHusky extends Dog implements Move {
    public SiberianHusky() {
        this.position = 0;
        this.averageLength = 55;
    }

    @Override
    public void move() {
        position += 2;
        System.out.println("2. - Anjing Siberian Husky berpindah posisi ke : " + position);
    }

    @Override
    public void describe() {
        System.out.println("   - Ini adalah anjing Siberian Husky, Dia Bersifat Ramah, Pandai, Siaga, Lembut dan Bersahabat");
        System.out.println("   - Jenis Anjing seperti ini biasa disebut Anjing Pekerja, Gembala Jerman, Golden Retriever, dll");
        System.out.println("   - Panjang rata rata anjing Siberian Husky adalah " + averageLength + "CM");
    }
}

class Bulldog extends Dog implements Move {
    public Bulldog() {
        this.position = 0;
        this.averageLength = 50;
    }

    @Override
    public void move() {
        position += 1;
        System.out.println("3. - Anjing Bulldog berpindah posisi ke : " + position);
    }

    @Override
    public void describe() {
        System.out.println("   - Ini adalah anjing Bulldog, Dia bersifat Jinak, Bersahabat, Berkelompok, berkemauan keras dan sangat berlendir");
        System.out.println("   - Jenis Anjing seperti ini biasa disebut American BullDog, Dogue de Bordeaux, English Bulldog(Peliharaan), dll");
        System.out.println("   - Panjang rata rata anjing Bulldog adalah " + averageLength + "CM");
    }
}

class GermanShepherd extends Dog implements Move {
    public GermanShepherd() {
        this.position = 0;
        this.averageLength = 65;
    }

    @Override
    public void move() {
        position += 3;
        System.out.println("4. - Anjing German Shepherd berpindah posisi ke : " + position);
    }

    @Override
    public void describe() {
        System.out.println("   - Ini adalah anjing German Shepherd, Dia Bersifat Percaya diri, Melindungi, Waspada, Patuh, Berani, Penasaran dan Pandai");
        System.out.println("   - Jenis Anjing seperti ini biasa disebut Douberman, Dutch(anjing yang di Shaun The Sheep), Anjing Polisi, dll");
        System.out.println("   - Panjang rata rata anjing German Shepherd adalah " + averageLength + "CM");
    }
}

class Smartphone implements Move {
    private int price;
    private String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("5. - Smartphone " + brand + " berpindah harga menjadi Rp." + price);
    }
}

class Car implements Move { // buat atribut
    private String color;
    private int maxSpeed;
    private int totalForwardGear;

    public Car (String color, int maxSpeed, int totalForwardGear) {  // buat objek
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.totalForwardGear = totalForwardGear;
    }

    @Override
    public void move() {
        System.out.println(" ");
        System.out.println("6. - Mobil dengan warna " + color + " Sedang beraKselerasi dengan total gigi " + totalForwardGear + " dengan kecepatan maksimum " + maxSpeed + " KM/J");
        System.out.println(" ");
    }
}