package DesignPatterns.AbstractFactory;

class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("✅ Чекбокс Windows переключен");
    }
}
