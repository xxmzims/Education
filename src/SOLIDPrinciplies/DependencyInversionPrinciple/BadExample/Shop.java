package SOLIDPrinciplies.DependencyInversionPrinciple.BadExample;

import java.math.BigDecimal;

// Вроде все хорошо, но мы уже нарушили принцип инверсии зависимостей,
// так как мы тесно связали оплату наличными к нашему магазину.
// И если в дальнейшем нам необходимо будет добавить оплату еще
// банковской картой и телефоном ("100% понадобится"), то нам придется
// переписывать и изменять много кода. Мы в нашем коде модуль верхнего
// уровня тесно связали с модулем нижнего уровня, а нужно чтобы оба уровня зависели от абстракции.
public class Shop {
    private Cash cash;
    public Shop(Cash cash) {
        this.cash = cash;
    }
    public void doPayment(Object order, BigDecimal amount){
        cash.doTransaction(amount);
    }
}
