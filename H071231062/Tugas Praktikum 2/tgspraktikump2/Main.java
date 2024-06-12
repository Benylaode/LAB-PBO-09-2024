package tgspraktikump2;

class Cuboid{
    double height;
    double widht;
    double length;
    
    double getVolume(){
        return length*widht*height;
  }
}

public class Main{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 30;
        cuboid.widht = 25;
        cuboid.length = 6;
        
        System.out.printf("Volume = %2.f", cuboid.getVolume());
    }
}