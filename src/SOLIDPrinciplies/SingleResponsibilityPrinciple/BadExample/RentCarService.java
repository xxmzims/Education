package SOLIDPrinciplies.SingleResponsibilityPrinciple.BadExample;


// Плохой пример. Несколько зон ответственности.
public class RentCarService {

    public String findCar(String carNo) {
        //find car by number
        return "car";
    }

    public String orderCar(String carNo, String client) {
        //client order car
        return "order";
    }

    public void printOrder(String order) {
        //print order
    }
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            //do some job
        }
        if (carType.equals("pickup")) {
            //do some job
        }
        if (carType.equals("van")) {
            //do some job
        }
    }
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
    }
}

