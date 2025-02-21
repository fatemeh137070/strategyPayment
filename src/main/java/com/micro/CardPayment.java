package com.micro;

class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("پرداخت " + amount + " تومان با کارت انجام شد.");
    }
}