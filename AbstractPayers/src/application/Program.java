package application;

import entities.Payer;
import entities.PayerCompany;
import entities.PayerIndividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Payer> listPayer =  new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i +1) + " data:");
            System.out.print("Individual or company (i/c) ? ");
            char response = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: $ ");
            double anualIncome = sc.nextDouble();

            switch (response){
                case 'i':
                    System.out.print("Health expenditures: $ ");
                    double healthExpenditures = sc.nextDouble();
                    listPayer.add(new PayerIndividual(name, anualIncome, healthExpenditures));
                    break;
                case 'c':
                    System.out.print("Number of employees: ");
                    int numberEmployees = sc.nextInt();
                    listPayer.add(new PayerCompany(name, anualIncome, numberEmployees));
                    break;
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Payer payer : listPayer){
            double tax = payer.tax();
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}