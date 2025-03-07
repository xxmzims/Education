package DesignPatterns.Observer;

class PhoneDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("📱 Телефон: Текущая погода - " + weather);
    }
}
