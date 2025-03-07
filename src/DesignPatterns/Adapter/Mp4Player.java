package DesignPatterns.Adapter;

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("🎬 Воспроизведение MP4-файла: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {} // Не реализовано
}
