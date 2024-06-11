public interface Device {
    public String name = "device";

    void move();
}

class Smartphone implements Device {
    int price;
    String brand;

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Device {
    int totalFowardGear, maxSpeed;
    String color;

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
