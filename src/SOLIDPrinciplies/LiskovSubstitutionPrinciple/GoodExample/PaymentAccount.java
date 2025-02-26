package SOLIDPrinciplies.LiskovSubstitutionPrinciple.GoodExample;

import java.math.BigDecimal;

// Отдельный класс для проведения оплат, который расширяет базовый класс аккаунт
public class PaymentAccount extends Account{
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }
}
