package SOLIDPrinciplies.LiskovSubstitutionPrinciple.GoodExample;

import java.math.BigDecimal;

// Наследуем от класса, методы поддерживаются все
public class DepositAccount extends Account{
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(121212);
    };
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
}