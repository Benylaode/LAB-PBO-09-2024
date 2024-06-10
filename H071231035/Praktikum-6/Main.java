package praktikum;

public class Main {
    public static void main(String[] args) {
        SiberianHusky Siberian = new SiberianHusky(7, 55);
        Siberian.move();
        Siberian.describe();
        
        Bulldog bulldog = new Bulldog(9,45);
        bulldog.move();
        bulldog.describe();

        Smartphone oppo = new Smartphone(7000000,"oppo");
        oppo.move();
        System.out.println(Smartphone.jauh);

        Car civic = new Car(6,210,"merah");
        civic.move();
    }
    
}
