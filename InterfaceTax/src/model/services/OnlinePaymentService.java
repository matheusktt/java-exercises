package model.services;

public interface OnlinePaymentService {

    public double  interest(double amount, int months);
    public double  paymentFee(double amount);
}