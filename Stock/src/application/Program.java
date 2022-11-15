package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        Integer quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");
        Integer value = sc.nextInt();
        product.addProduct(value);
        System.out.println("Update data: " + product);
        System.out.print("Enter the number of products to be removed from stock: ");
        Integer remove =  sc.nextInt();
        product.removeProduct(remove);
        System.out.println("Update data: " + product);
        sc.close();
    }
}
