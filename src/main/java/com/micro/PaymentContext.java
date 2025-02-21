package com.micro;

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("لطفاً یک روش پرداخت انتخاب کنید.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
