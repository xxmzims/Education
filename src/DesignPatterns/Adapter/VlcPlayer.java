package DesignPatterns.Adapter;

// Реализация проигрывателя VLC
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("📀 Воспроизведение VLC-файла: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {} // Не реализовано
}
