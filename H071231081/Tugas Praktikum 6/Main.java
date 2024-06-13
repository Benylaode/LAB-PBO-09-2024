public class Main {

    public static void main(String[] args) {
      Dog pitbull = new Pitbull();
      Dog siberianHusky = new SiberianHusky();
      Dog bulldog = new Bulldog();
      Dog germanShepherd = new GermanShepherd();
  
      Smartphone smartphone = new Smartphone(23000000, "iPhone 15 Pro Max");
      Car car = new Car("Putih", 180, 6);
  
      System.out.println(" ");
      MoveAndDescribe(pitbull);
  
      System.out.println(" ");
      MoveAndDescribe(siberianHusky);
  
      System.out.println(" "); // berguna untuk memanggil kedua move dan describe
      MoveAndDescribe(bulldog);
  
      System.out.println(" ");
      MoveAndDescribe(germanShepherd);
  
      System.out.println(" ");
      smartphone.move();
      car.move();
    }
  
    public static void MoveAndDescribe(Dog dog) {
      dog.move();
      dog.describe();
    }
  }
  