package SOLIDPrinciplies.LiskovSubstitutionPrinciple.BadExample;

import java.math.BigDecimal;

// Базовый класс аккаунта
public class Account {
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(1234234);
    };
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
    public void payment(String numberAccount, BigDecimal sum){
        //logic
    }

}
