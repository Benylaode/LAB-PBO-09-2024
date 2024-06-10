package Soal_02;

class Laptop extends Product {
    private int ramSize;
    private String processorType;

    Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram size: " + this.ramSize);
        System.out.println("Processor type: " + this.processorType);
    }
}
