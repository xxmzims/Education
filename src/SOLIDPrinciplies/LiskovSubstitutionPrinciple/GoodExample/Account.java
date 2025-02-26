package SOLIDPrinciplies.LiskovSubstitutionPrinciple.GoodExample;

import java.math.BigDecimal;

// Базовый класс аккаунт с методами, которые будут поддерживать все класс
public class Account {
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(1121);
    };
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
}
