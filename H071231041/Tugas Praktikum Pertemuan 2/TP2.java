import java.util.Scanner;
class Product {
    String id;
    String name;
    int stok;
    int price;

    public Product(String id, String name, int stok, int price) {
        this.id = id;
        this.name = name;
        this.stok = stok;
        this.price = price;
    }

    public void dataProduct() {
        System.out.println("\nProduct's id: " + id);
        System.out.println("Product's name: " + name);
        System.out.println("Stock amount: " + stok);
        System.out.println("Product's price: " + price + "\n");

        if (stok > 0) {
            System.out.println("Stock is available");
        } else {
            System.out.println("Stock is not available");
        }
    }
}


public class TP2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input id product: ");
    String id_input = input.next();

    System.out.print("Input product's name: ");
    String name_input = input.next();
    
    System.out.print("Input stock amount: ");
    int stok_input = input.nextInt();

    System.out.print("Input product's price: ");
    int price_input = input.nextInt();

    Product product1 = new Product(id_input, name_input, stok_input, price_input);
    product1.dataProduct();
    
    Product product2 = new Product("hsf26238", "taro", 9, 5000);
    product2.dataProduct();

    input.close();
    }
}