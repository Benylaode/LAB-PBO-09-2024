package tgspraktikum6;

public class siberianhusky extends dog {
    public siberianhusky(int position,int averagelength){
        this.position = position;
        this.averagelength = averagelength;
    }

    @Override
    public void Move() {
        position +=2;
        System.out.println("siberian husky bergerak sejauh " + position + " titik");
        // super.Move();
    }

    @Override
    public void describe() {
        System.out.println("karmaa");
        // super.describe();
    }

    
}
