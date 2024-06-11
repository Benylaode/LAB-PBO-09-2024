package tgspraktikump5;

public class Smartphone extends Product {
    double ScreenSize;
    int StorageCapacity;

    public Smartphone(String brand, int serialNumber, double price, double screenSize, int storageCapacity) {
        super(brand, serialNumber, price);
        ScreenSize = screenSize;
        StorageCapacity = storageCapacity;
    }

    void displayinfo(){
        super.displayinfo();
        System.out.println("Screen Size : " + ScreenSize);
        System.out.println("Storage Capacity : " + StorageCapacity);
    }
}
