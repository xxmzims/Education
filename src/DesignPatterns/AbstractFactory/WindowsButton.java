package DesignPatterns.AbstractFactory;

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("🪟 Отрисовка кнопки в стиле Windows");
    }
}
