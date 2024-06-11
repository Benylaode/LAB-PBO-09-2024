package tgspraktikump5;

public class Product {
    String brand;
    int serialNumber;
    double price;
    public Product(String brand, int serialNumber, double price) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    void displayinfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Nomer Seri : " + serialNumber);
        System.out.println("Harga : " + price);

    }
}
