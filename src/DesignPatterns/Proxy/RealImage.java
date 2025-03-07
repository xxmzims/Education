package DesignPatterns.Proxy;

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Загрузка при создании
    }

    private void loadFromDisk() {
        System.out.println("🌀 Загрузка тяжелого изображения: " + filename);
    }

    @Override
    public void display() {
        System.out.println("🖼️ Отображение изображения: " + filename);
    }
}
