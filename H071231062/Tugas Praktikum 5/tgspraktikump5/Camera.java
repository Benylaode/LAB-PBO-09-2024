package tgspraktikump5;

public class Camera extends Product{
    int resolution;
    String lenstype;
    public Camera(String brand, int serialNumber, double price,int resolution, String lenstype) {
        super(brand, serialNumber, price);
        this.resolution = resolution;
        this.lenstype = lenstype;
    }
    void displayinfo(){
        super.displayinfo();
        System.out.println("Resolution : " + resolution);
        System.out.println("Lens Type : " + lenstype);
    }
}
