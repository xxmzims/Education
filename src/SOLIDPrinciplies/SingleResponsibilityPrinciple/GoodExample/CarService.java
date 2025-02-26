package SOLIDPrinciplies.SingleResponsibilityPrinciple.GoodExample;

// Класс для поиска машин.Другая зона ответственности
public class CarService {
    public String findCar(String carNo) {
        //find car by number
        return "car";
    }
}