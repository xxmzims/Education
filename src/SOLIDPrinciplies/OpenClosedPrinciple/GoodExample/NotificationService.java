package SOLIDPrinciplies.OpenClosedPrinciple.GoodExample;

// Создаем interface и описываем метод отправки сообщений,
// тем самым подготавливаем возможность реализовать этот интерфейс по разному
public interface NotificationService {
    void sendMessage(String message);
}
