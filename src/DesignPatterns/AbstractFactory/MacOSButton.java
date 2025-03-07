package DesignPatterns.AbstractFactory;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("🍎 Отрисовка кнопки в стиле macOS");
    }
}
