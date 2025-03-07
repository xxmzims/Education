package DesignPatterns.Strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Выбор стратегии оплаты
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "123"));
        cart.checkout(100); // 💳 Оплата через кредитную карту

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50);  // 📧 Оплата через PayPal

        cart.setPaymentStrategy(new CryptoPayment("0xABC123..."));
        cart.checkout(200); // 🪙 Оплата через криптокошелек
    }
}