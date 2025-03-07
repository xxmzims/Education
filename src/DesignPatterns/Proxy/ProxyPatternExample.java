package DesignPatterns.Proxy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image imageProxy = new ProxyImage("space_image.jpg");

        // Изображение НЕ загружается здесь
        System.out.println("👉 Клиент: Прокси создан. Изображение еще не загружено.");

        // Изображение загружается и отображается только при первом вызове
        imageProxy.display(); // Output: 🌀 Загрузка... 🖼️ Отображение...
        imageProxy.display(); // Output: 🖼️ Отображение (переиспользует загруженное)
    }
}
