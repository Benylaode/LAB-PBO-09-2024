package Pertemuan5.Nomor2;

class Camera extends Product{
	int resolution;
	String lensType;

	Camera(String brand, int seriesNumber, double price, int resolution, String lensType){
		super(brand, seriesNumber, price);
		this.resolution = resolution;
		this.lensType = lensType;
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("Resolution : " + this.resolution);
		System.out.println("Lens Type : " + this.lensType);
	}
}