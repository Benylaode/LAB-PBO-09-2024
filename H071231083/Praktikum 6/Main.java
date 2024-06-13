public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Car car = new Car();  
        Pitbull pitbull = new Pitbull();

        smartphone.move(); //pemanggilan smartphone.move akan mencetak pesan smartphone berpindah
        System.out.println(Smartphone.name);
        car.move(); //pemanggilan car.move akan mencetak pesan "mobil sedang berakselerasi" karena itu adalah implementasi metod move dari kls car
        pitbull.move(); //pemanggilan pitbull.move akan mencetak pesan pitbull berpindah ke kanan (+3) karena itu adalah implementasi metod move dari kls pitbull
    }
}
