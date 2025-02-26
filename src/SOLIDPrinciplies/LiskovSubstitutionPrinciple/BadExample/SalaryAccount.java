package SOLIDPrinciplies.LiskovSubstitutionPrinciple.BadExample;

import java.math.BigDecimal;

// Реализуем базовый класс, для зарплатного аккаунта, тут все еще все хорошо. Все методы поддерживаются
public class SalaryAccount extends Account{
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(2323232);
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
