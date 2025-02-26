package SOLIDPrinciplies.LiskovSubstitutionPrinciple.GoodExample;

import java.math.BigDecimal;

// Сейчас замена класса PaymentAccount на его класс-наследник SalaryAccount
// не "поломает" нашу программу, так как класс SalaryAccount имеет доступ ко всем методам, что и PaymentAccount.
// Также все будет хорошо при замене класса Account на его класс-наследник PaymentAccount.
public class SalaryAccount extends PaymentAccount{
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(222323);
    };
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    @Override
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }
}
