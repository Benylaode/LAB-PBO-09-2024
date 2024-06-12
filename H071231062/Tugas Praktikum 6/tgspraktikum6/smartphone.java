package tgspraktikum6;

public class smartphone implements move{
    int price;
    String brand;
    
    public smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
        
    }
    @Override
    public void Move(){
        System.out.println("Smartphone berpindah");
        
    }
    @Override
    public void describe(){
        System.out.println("poco x3 NFC");
    }
    public int getPrice() {
        return price;
    }
    public String getBrand() {
        return brand;
    }
    
    
}
