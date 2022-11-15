package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many dollars will be bought ? ");
        double quantity = sc.nextDouble();
        double result = CurrencyConverter.covert(quantity);
        System.out.println("Amount to be paid in reais: " +  String.format("%.2f", result));

        sc.close();
    }
}