package DesignPatterns.FactoryMethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.newDocument(); // Создает PDF

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.newDocument(); // Создает Word
    }
}
