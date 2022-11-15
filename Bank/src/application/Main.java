package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        System.out.println("Welcome to bank");
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n) ? ");
        char initialDeposit = sc.next().charAt(0);
        if ( initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: $");
            double firstDeposit = sc.nextDouble();
            acc = new Account(number, holder, firstDeposit);
        }else {
            acc = new Account(number, holder);
        }

        System.out.println(acc);

        System.out.print("Enter a deposit value: $");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(acc);
        System.out.print("Enter a withdraw value: $");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(acc);
        sc.close();
    }
}