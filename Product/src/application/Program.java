package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int productNumbers = sc.nextInt();

        for(int i = 0; i < productNumbers; i++) {
            System.out.println("Prodcut #" + (1 + i) + " data:");
            System.out.print("Common, used or imported (c/u/i) ? ");
            char response = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: $ ");
            double price = sc.nextDouble();
            switch (response){
                case 'i':
                    System.out.print("Customs fee: $ ");
                    double customs = sc.nextDouble();
                    productList.add(new ImportedProduct(name, price, customs));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date date = sdf.parse(sc.next());
                    productList.add(new UsedProduct(name, price, date));
                    break;
                default:
                    productList.add(new Product(name, price));
                    break;
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product product : productList){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}