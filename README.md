Strategy Pattern for Payment Processing

This project demonstrates the Strategy Design Pattern to handle different payment methods in Java. It allows users to choose between three payment methods:

Card Payment

Cash Payment

Online Payment

How It Works

The PaymentStrategy interface defines the contract for different payment methods.

Three concrete implementations (CardPayment, CashPayment, and OnlinePayment) implement the payment strategy.

The PaymentContext class allows setting a payment strategy dynamically and executing payments using the chosen method.

The StrategyPatternExample class demonstrates how different payment strategies can be applied at runtime.

Usage

To use the strategy pattern in this project:

Create an instance of PaymentContext.

Set the desired payment strategy using setPaymentStrategy().

Execute the payment with the executePayment(amount) method.

Example:

PaymentContext context = new PaymentContext();

// Pay using card
context.setPaymentStrategy(new CardPayment());
context.executePayment(50000);

// Pay using cash
context.setPaymentStrategy(new CashPayment());
context.executePayment(20000);

// Pay online
context.setPaymentStrategy(new OnlinePayment());
context.executePayment(75000);

Requirements

Java 8 or later

License

This project is open-source and available for modification and distribution.