package DesignPatterns.AbstractFactory;
// Определяем алгоритм создания объектов
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}