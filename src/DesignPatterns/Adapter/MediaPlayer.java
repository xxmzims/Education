package DesignPatterns.Adapter;

// Интерфейс, который ожидает клиент (обычный аудиоплеер)
interface MediaPlayer {
    void play(String audioType, String fileName);
}
