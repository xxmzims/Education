package DesignPatterns.Strategy;

class CryptoPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("🪙 Оплата " + amount + "$ через криптокошелек: " + walletAddress);
    }
}
