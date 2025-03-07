package DesignPatterns.FactoryMethod;

// Абстрактная фабрика (создает документы)
abstract class DocumentFactory {
    abstract Document createDocument(); // Фабричный метод

    void newDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
    }
}
