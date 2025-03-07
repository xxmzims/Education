package DesignPatterns.Adapter;

// Клиентский код (обычный аудиоплеер с поддержкой адаптера)
class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("🎵 Воспроизведение MP3-файла: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("❌ Формат " + audioType + " не поддерживается");
        }
    }
}
