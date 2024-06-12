package tgspraktikum6;

public class car implements move{
    int totalforwardgear,maxspeed;
    String color;
    public car(int totalforwardgear, int maxspeed, String color) {
        this.totalforwardgear = totalforwardgear;
        this.maxspeed = maxspeed;
        this.color = color;
    }

    @Override
    public void Move() {
        System.out.println("mobil sedang berakselerasi");
    }
    @Override
    public void describe() {
        System.out.println("Toyota 86");
        
    }
    public int getTotalforwardgear() {
        return totalforwardgear;
    }
    public int getMaxspeed() {
        return maxspeed;
    }
    public String getColor() {
        return color;
    }
    
    
}
