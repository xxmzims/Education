package DesignPatterns.Strategy;


// внедряем наши стратегии, даем возможность для гибкого выбора способа оплаты
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //проверка
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("❌ Выберите метод оплаты!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
