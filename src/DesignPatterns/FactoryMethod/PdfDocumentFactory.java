package DesignPatterns.FactoryMethod;

class PdfDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new PdfDocument();
    }
}
