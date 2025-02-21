package com.micro;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        

        context.setPaymentStrategy(new CardPayment());
        context.executePayment(50000);
        

        context.setPaymentStrategy(new CashPayment());
        context.executePayment(20000);
        

        context.setPaymentStrategy(new OnlinePayment());
        context.executePayment(75000);
    }
}
