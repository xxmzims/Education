package DesignPatterns.FactoryMethod;

class WordDocument extends Document {
    @Override
    void open() {
        System.out.println("📝 Открытие Word-документа");
    }

    @Override
    void save() {
        System.out.println("💾 Сохранение Word-документа");
    }
}
