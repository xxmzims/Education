package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// Конкретный субъект (метеостанция)
class WeatherStation implements Subject {
    private String weather;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    // Метод для изменения состояния (погоды)
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers(); // Уведомляем всех наблюдателей
    }
}
