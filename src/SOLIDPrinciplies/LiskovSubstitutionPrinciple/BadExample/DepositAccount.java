package SOLIDPrinciplies.LiskovSubstitutionPrinciple.BadExample;

import java.math.BigDecimal;

//Если сейчас в коде программы везде, где мы использовали класс Account заменить на его класс-наследник (подтип)
// SalaryAccount, то программа продолжит нормально работать, так как в классе SalaryAccount доступны все операции,
// которые есть и в классе Account.
//
//Если же мы такое попробуем сделать с классом DepositAccount, то есть заменим базовый класс Account на
// его класс-наследник DepositAccount, то программа начнет неправильно работать, так как при вызове метода
// payment() будет выбрасываться исключение new UnsupportedOperationException. Таким
// образом произошло нарушение принципа подстановки Барбары Лисков.
//
//Для того чтобы следовать принципу подстановки Барбары Лисков необходимо в базовый (родительский) класс
// выносить только общую логику, характерную для классов наследников, которые будут ее реализовывать и,
// соответственно, можно будет базовый класс без проблем заменить на его класс-наследник.
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
    @Override
    public void payment(String numberAccount, BigDecimal sum){
        throw new UnsupportedOperationException("Operation not supported");
    }
}
