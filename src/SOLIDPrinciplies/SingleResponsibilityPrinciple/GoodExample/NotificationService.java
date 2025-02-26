package SOLIDPrinciplies.SingleResponsibilityPrinciple.GoodExample;

// Класс для отправки уведомлений. Зона ответственности за отправку уведомление
public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
    }
}
