package Soal_02;

class Smartphone extends Product {
    private double screenSize;
    private int storageCapacity;

    Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen size: " + this.screenSize);
        System.out.println("Storage capacity: " + this.storageCapacity);
    }
}
