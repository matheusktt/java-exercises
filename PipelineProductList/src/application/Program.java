/*
    Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv (suponha que exista pelo menos um
    produto). Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que
    possuem preço inferior ao preço médio.
*/

package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String path = "/home/matheus/Documentos/productList.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> productList = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double average = productList.stream().map(product -> product.getPrice()).reduce(0.0, (x, y) -> x + y) / productList.size();

            System.out.println("Average price: $ " + String.format("%.2f", average));

            Comparator<String> comp = (product1, product2) -> product1.toUpperCase().compareTo(product2.toUpperCase());

            List<String> productNames = productList.stream().filter(product -> product.getPrice() < average).map(product -> product.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            productNames.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}