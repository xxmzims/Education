package SOLIDPrinciplies.DependencyInversionPrinciple.GoodExample;

import java.math.BigDecimal;

// Делаем интерфейс с методом от которого будут наследоваться классы
public interface Payments {
    void doTransaction(BigDecimal amount);
}
