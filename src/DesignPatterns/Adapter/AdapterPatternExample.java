package DesignPatterns.Adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3");  // 🎵 Воспроизведение MP3
        player.play("mp4", "movie.mp4"); // 🎬 Воспроизведение MP4 через адаптер
        player.play("vlc", "film.vlc");  // 📀 Воспроизведение VLC через адаптер
        player.play("avi", "video.avi"); // ❌ Ошибка: неподдерживаемый формат
    }
}