package DesignPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("💳 Оплата " + amount + "$ через кредитную карту: " + cardNumber);
    }
}
