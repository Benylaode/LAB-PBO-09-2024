public interface Device { 
    public String name = "device"; //adalah sebuah interface yg mendefinisikan suatu method yaitu move. interface ini juga memiliki sebuah variabel name yg sudah didefinisikan dan diinisialisasi dgn nilai device.

    void move();
    
}

class Smartphone implements Device { //kls ini mengimplementasikan interface device. selain itu, kls ini memiliki 2 variabel yaitu price dan brand.
    int price;
    String brand;

    @Override
    public void move() { //method move di override utk menampilkan pesan smarthphone berpindah saat di panggil
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Device { //ini jg mengimplementasikan interface device. variabel anggota dari kls ini adalah totalFowardGear, maxSpeed dan color
    int totalFowardGear, maxSpeed;
    String color;

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
