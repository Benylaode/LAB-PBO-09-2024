package soal2;

public class Smartphone extends Product {
    double screensize;
    int storageCapacity;
    public double getScreensize() {
        return screensize;
    }
    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    Smartphone(String brand, int seriesNumber, double pricedouble,double screensize,int storageCapacity){
        super(brand, seriesNumber, pricedouble);
        this.screensize = screensize;
        this.storageCapacity = storageCapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("screen size: " + this.screensize);
        System.out.println("storage capacity: " + this.storageCapacity
        );
    }
}
