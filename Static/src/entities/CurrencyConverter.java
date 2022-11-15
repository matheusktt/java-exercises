package entities;

public class CurrencyConverter {
    public static final double DOLAR = 3.10;
    public static final double tax = 0.06;

    public double quantity;

    public static double covert (double quantity) {
        return DOLAR * quantity * (1.0 + tax);
    }
}
