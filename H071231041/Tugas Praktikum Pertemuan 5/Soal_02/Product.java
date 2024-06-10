package Soal_02;

import java.util.Vector;
import java.util.Scanner;

class Product {
    String brand;
    int seriesNumber;
    double price;
    static Vector<Product> listProduct = new Vector<>();
    Scanner input = new Scanner(System.in);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Series Number: " + this.seriesNumber);
        System.out.println("Price: " + this.price);
    }

    static void showAllProduct() {
        System.out.println("----- List All Product -----");
        if (listProduct.size() < 1) {
            System.out.println("Belum ada produk yang ditambahkan.");
        } else {
            for (int i = 0; i < listProduct.size(); i++) {
                System.out.println("Product " + String.valueOf(i + 1) + ":");
                listProduct.get(i).displayInfo();
                System.out.println();
            }
        }
        System.out.println("----------------------------");
    }

}
