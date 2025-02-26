package SOLIDPrinciplies.InterfaceSegregationPrinciple.BadExample;

// Мы хотим реализовать интерфейс оплаты для разных способов оплаты.
// Если мы будем реализовывать этот интерфейс для разных классов, то нам придется реализовывать все методы. Это плохой пример
public interface Payments {
    void payWebMoney();
    void payCreditCard();
    void payPhoneNumber();
}
