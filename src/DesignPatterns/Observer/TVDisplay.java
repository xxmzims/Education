package DesignPatterns.Observer;

class TVDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("📺 Телевизор: Текущая погода - " + weather);
    }
}

