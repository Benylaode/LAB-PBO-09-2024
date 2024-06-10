package Pertemuan5.Nomor2;

class Product{
	String brand;
	int seriesNumber;
	double price;

	public Product(String brand, int seriesNumber, double price) {
		this.brand = brand;
		this.seriesNumber = seriesNumber;
		this.price = price;
	}

	public void displayInfo(){
		System.out.println("Brand : " + this.brand);
		System.out.println("Serial Number : " + this.seriesNumber);
		System.out.println("Price : " + this.price);
	}
}
