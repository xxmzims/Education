package DesignPatterns.Decorator;

// тестируем обертку
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Scanner1D scanner1D = new Scanner1D();
        scanner1D.scan();

        // оборачиваем наш класс
        Scanner2D scanner2D = new Scanner2D(scanner1D);

        // теперь наш класс поддерживает и 1д и 2д сканирование
        scanner2D.scan();
        scanner2D.scan2D();
    }
}
