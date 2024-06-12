package tgspraktikum6;

public class pitbull extends dog{
    // int position,averagelength;
    

    public pitbull(int position, int averagelength){
        this.position = position;
        this.averagelength = averagelength;
    }
    
    @Override
    public void Move() {
        position +=3;
        System.out.println("Pitbull berpindah sejauh " + position + " titik");
        // super.Move();
    }
    @Override
    public void describe() {
        System.out.println("pitbull rapper");
        // super.describe();
    }

    
}
