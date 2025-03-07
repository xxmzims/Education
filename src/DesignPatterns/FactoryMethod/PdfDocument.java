package DesignPatterns.FactoryMethod;

class PdfDocument extends Document {
    @Override
    void open() {
        System.out.println("📄 Открытие PDF-документа");
    }

    @Override
    void save() {
        System.out.println("💾 Сохранение PDF-документа");
    }
}
