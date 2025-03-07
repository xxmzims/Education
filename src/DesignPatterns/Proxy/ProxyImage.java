package DesignPatterns.Proxy;

class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage; // Реальный объект создается только при необходимости

    public ProxyImage(String filename) {
        this.filename = filename;
    }


    @Override
    public void display() {
        // Если этого изображения нет в памяти, то оно загрузится, а если есть, то уже отдаст нам его быстро из памяти
        if (realImage == null) {
            realImage = new RealImage(filename); // Ленивая загрузка
        }
        realImage.display();
    }
}

