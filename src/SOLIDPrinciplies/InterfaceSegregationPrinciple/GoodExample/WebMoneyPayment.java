package SOLIDPrinciplies.InterfaceSegregationPrinciple.GoodExample;
//Разделяем интерфейс на три способа оплаты
// Тем самым при наследовании мы можем выбрать только нужные нам методы интерфейсов, а не все
public interface WebMoneyPayment {
    void payWebMoney();
}

interface CreditCardPayment {
    void payCreditCard();
}

interface PhoneNumberPayment {
    void payPhoneNumber();
}