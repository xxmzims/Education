package DesignPatterns.Observer;

// Интерфейс субъекта (издателя)
interface Subject {
    // Регистрация наблюдателя
    void registerObserver(Observer observer);
    // Удаление наблюдателя
    void removeObserver(Observer observer);
    // удаление наблюдателей
    void notifyObservers();

}
