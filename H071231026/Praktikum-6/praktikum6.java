interface Move {
    void move();
}

abstract class Dog implements Move {
    int position;
    int averageLength;

    Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();
}

class Pitbull extends Dog {
    Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah sejauh  " + position + " titik");
    }
   
    
    public void describe() {
        System.out.print(">> ");
        System.out.println("Pitbull terkenal kuat, atletis, dan sayangnya memiliki reputasi sebagai anjing yang galak.");
    }
}

class SiberianHusky extends Dog {
    SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        position += 2;
        System.out.println("SiberianHusky berpindah sejauh " + position + " titik");
    }
    
    public void describe() {
        System.out.print(">> ");
        System.out.println("Siberian Husky terkenal dengan keindahan bulu yang tebal, mata mencolok, dan energi yang berlimpah.");
    }
}

class Bulldog extends Dog {
    Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah sejauh " + position + " titik");
    }
    
    public void describe() {
        System.out.print(">> ");
        System.out.println("Bulldog terkenal dengan wajah yang berkerut, tubuh yang kekar, dan sifat yang penyayang dan santai.");
    }
}

class GermanShepherd extends Dog {
    GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        this.position += 3;
        System.out.println("GermanShepherd berpindah sejauh " + position + " titik");
    }
    
    public void describe() {
        System.out.print(">> ");
        System.out.println("German Shepherd terkenal dengan kecerdasan, kesetiaan, dan kemampuan kerjanya yang luar biasa.");
    }
}

class Smartphone implements Move{
    int price;
    String brand;

    Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move{
    int totalForwardGear, maxSpeed;
    String color;

    Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void move() {
        System.out.println("Car berakselerasi");
    }
}

public class praktikum6 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1000000, "Samsung");
        Car car = new Car(200, 200, "Pink");
        Pitbull pitbull = new Pitbull(2, 70);
        SiberianHusky siberianHusky = new SiberianHusky(0, 1);
        Bulldog bulldog = new Bulldog(0, 6);
        GermanShepherd germanShepherd = new GermanShepherd(0, 1);
        System.out.println("----------------------------------------------------------------------------------------------------------");
        pitbull.move();
        pitbull.describe();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        siberianHusky.move();
        siberianHusky.describe();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        bulldog.move();
        bulldog.describe();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        germanShepherd.move();
        germanShepherd.describe();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        smartphone.move();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        car.move();
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}