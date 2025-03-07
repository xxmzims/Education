package DesignPatterns.FactoryMethod;

class WordDocumentFactory extends DocumentFactory {
    @Override
    Document createDocument() {
        return new WordDocument();
    }
}
