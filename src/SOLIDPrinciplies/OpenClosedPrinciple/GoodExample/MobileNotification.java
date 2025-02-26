package SOLIDPrinciplies.OpenClosedPrinciple.GoodExample;

// // реализуем интерфейс, тем самым расширяем его и соблюдая принцип открытости закрытости классов
public class MobileNotification implements NotificationService {
    @Override
    public void sendMessage(String message) {
        //write sms
        //send sms
    }
}
