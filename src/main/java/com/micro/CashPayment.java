package com.micro;

class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت " + amount + " تومان به صورت نقدی انجام شد.");
    }
}