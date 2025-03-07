package DesignPatterns.Observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Создаем метеостанцию
        WeatherStation weatherStation = new WeatherStation();

        // Создаем наблюдателей
        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        // Регистрируем наблюдателей
        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(tvDisplay);

        // Изменяем погоду (наблюдатели получают уведомления)
        weatherStation.setWeather("☀️ Солнечно");
        weatherStation.setWeather("🌧️ Дождь");

        // Удаляем одного наблюдателя
        weatherStation.removeObserver(tvDisplay);

        // Еще одно изменение погоды (телевизор больше не получает уведомления)
        weatherStation.setWeather("❄️ Снег");
    }
}