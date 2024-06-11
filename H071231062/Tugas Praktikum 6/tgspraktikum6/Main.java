package tgspraktikum6;

public class Main {
    public static void main(String[] args) {
        pitbull Pitbull = new pitbull(0, 3);
        smartphone Smartphone = new smartphone(100000, "poco");
        car Car = new car(2, 500, "pink");

        Pitbull.Move();
        Pitbull.describe();
        Smartphone.Move();
        Car.Move();

        System.out.println("harga " + Smartphone.getPrice());
        System.out.println("merk smartphone : " + Smartphone.getBrand());
        
        System.out.println("gigi berapa sekarang kanda? " + Car.getTotalforwardgear());
        System.out.println("warna mobil :" + Car.getColor());
        System.out.println("TOPSPEED : " + Car.getMaxspeed());

    }

}
