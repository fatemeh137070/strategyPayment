package com.micro;

class OnlinePayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت " + amount + " تومان به صورت اینترنتی انجام شد.");
    }
}