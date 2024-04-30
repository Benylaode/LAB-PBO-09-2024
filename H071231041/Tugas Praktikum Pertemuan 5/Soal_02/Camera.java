package Soal_02;

class Camera extends Product {
    private int resolution;
    private String lensType;

    Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Lens Type: " + this.lensType);
    }
}
