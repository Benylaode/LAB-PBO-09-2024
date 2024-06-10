package praktikum;
abstract class Dog implements Perpindahan {
    int position, averagelength;
    public Dog(int position, int averagelength) {
        this.position = position;
        this.averagelength = averagelength;
    }
    
    public int getPosition() {
        return position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    public int getAveragelength() {
        return averagelength;
    }
    
    public void setAveragelength(int averagelength) {
        this.averagelength = averagelength;
    }
    abstract void describe();
}
