package SOLIDPrinciplies.SingleResponsibilityPrinciple.GoodExample;

// Информация об машинах. Продолжаем разделять класс на зоны ответственности
public class CarInfoService {
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
}
