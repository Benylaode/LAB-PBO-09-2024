package tgspraktikum6;

public class germanshepherd extends dog {
    public germanshepherd(int position, int averagelength){
        this.position = position;
        this.averagelength = averagelength;
    }
    @Override
    public void Move() {
        position += 3;
        System.out.println("german shepherd bergerak sejauh " + position + " titik");
        // super.Move();
    }
    @Override
    public void describe() {
        System.out.println("anjing polisi");
        // super.describe();
    }

    
}
