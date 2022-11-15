package entities;

public class Account {
    private int numberAccount;
    private String name;
    private double balance;

    public Account() {

    }

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public Account(int numberAccount, String name, double balance) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double valueDeposit){
        balance += valueDeposit;
    }

    public void withdraw (double valueWithdraw){
        balance -= valueWithdraw + 5;
    }

    @Override
    public String toString() {
        return  "Account: " + numberAccount +
                ", Holder " + name +
                ", balance: $ " + String.format("%.2f", balance);
    }
}
