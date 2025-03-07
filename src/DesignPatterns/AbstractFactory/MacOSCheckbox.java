package DesignPatterns.AbstractFactory;

class MacOSCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("✅ Чекбокс macOS переключен");
    }
}