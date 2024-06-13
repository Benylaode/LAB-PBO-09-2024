package soal2;

public class Laptop extends Product{
    int ramSize;
    String processorType;
    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public Laptop(String brand, int seriesNumber, double price,int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Ram Size: " + this.ramSize);
        System.out.println("Processor Type: " + this.processorType);
    }
}
