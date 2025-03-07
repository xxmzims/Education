package DesignPatterns.Decorator;

// наш класс обертка над классом, который будет уметь 1д и 2д сканирование

public class Scanner2D {

    private final Scanner1D scanner1D;

    public Scanner2D(Scanner1D scanner1D){
        this.scanner1D = scanner1D;
    }

    // прокидываем на первоначальный класс уже реализованный метод scan
    public void scan(){
        scanner1D.scan();
    }

    // реализуем дополнение к нашему первоначальному классу
    public void scan2D(){
        System.out.println("Я сканирую и в 2д пространстве тоже");
    }
}
