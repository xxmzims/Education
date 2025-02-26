package SOLIDPrinciplies.OpenClosedPrinciple.GoodExample;

// реализуем интерфейс, тем самым расширяем его и соблюдая принцип открытости закрытости классов
public class EmailNotification implements NotificationService {
    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}
