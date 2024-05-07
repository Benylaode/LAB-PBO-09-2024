package praktikum;

public class Car implements Perpindahan {
    int totalForwardGear, maxSpeed;
    String color;
    
    public Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Mobil civic " + color + " sedang akselerasi menuju kecepatan maksimum " + maxSpeed + " km/jam dengan transmisi maju gigi " + totalForwardGear +".");
        System.out.println();
    }
}
