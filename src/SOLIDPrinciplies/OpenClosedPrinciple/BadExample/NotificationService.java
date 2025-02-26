package SOLIDPrinciplies.OpenClosedPrinciple.BadExample;

// Изначально класс мог отправлять уведомления только по email. Мы дописали код
// для отправки сообщений по смс. Это плохой пример принципа penClosedPrinciple,
// потому что мы изменили класс, а не расширили его
public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
        if (typeMessage.equals("sms")) {
            //write sms
            //send sms
        }

    }
}
