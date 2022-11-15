package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc =  new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 0.0, 500.0);

        //        UPCASTING

        Account acc1 = bacc; //Uma Business Account é uma Account por isso o Upcasting é possível
        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 200.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
        Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 10.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // se o acc3 for uma instancia de BussinessAccount o downcast será permitido
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}