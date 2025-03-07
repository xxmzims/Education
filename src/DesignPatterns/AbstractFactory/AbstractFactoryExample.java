package DesignPatterns.AbstractFactory;

class AbstractFactoryExample {
    public static void main(String[] args) {
        // Создание фабрики для Windows
        GUIFactory windowsFactory = new WindowsFactory();
        Button winButton = windowsFactory.createButton();
        Checkbox winCheckbox = windowsFactory.createCheckbox();
        winButton.render();
        winCheckbox.toggle();

        // Создание фабрики для macOS
        GUIFactory macFactory = new MacOSFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macButton.render();
        macCheckbox.toggle();
    }
}
