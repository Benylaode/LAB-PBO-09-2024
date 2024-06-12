package tgspraktikump5;

public class Laptop extends Product{
    int ramsize;
    String processortype;
    public Laptop(String brand, int serialNumber, double price, int ramsize, String processortype) {
        super(brand, serialNumber, price);
        this.ramsize = ramsize;
        this.processortype = processortype;
    }
    void displayinfo(){
        super.displayinfo();
        System.out.println("Ram Size : " + ramsize);
        System.out.println("Processor Type : " + processortype);
    }
}
