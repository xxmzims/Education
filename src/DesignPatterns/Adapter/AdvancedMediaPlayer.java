package DesignPatterns.Adapter;

// Интерфейс для "продвинутых" форматов (несовместим с MediaPlayer)
interface AdvancedMediaPlayer {
    void playMp4(String fileName);
    void playVlc(String fileName);
}
