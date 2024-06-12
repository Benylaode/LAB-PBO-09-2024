public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Car car = new Car();
        Pitbull pitbull = new Pitbull();

        smartphone.move();
        System.out.println(Smartphone.name);
        car.move();
        pitbull.move();
    }
}
