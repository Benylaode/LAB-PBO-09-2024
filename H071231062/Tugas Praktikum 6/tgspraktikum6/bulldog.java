package tgspraktikum6;

public class bulldog extends dog {
    public bulldog(int position,int averagelength){
       this.position = position;
       this.averagelength = averagelength;
    }

    @Override
    public void Move() {
        System.out.println("bulldog galakk");
        // super.Move();
    }
    @Override
    public void describe() {
        position += 1;
        System.out.println("bulldog bergerak sejauh " + position + " titik");
        // super.describe();
    }

    
}
