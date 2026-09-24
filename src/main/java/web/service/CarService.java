package web.service;

import java.util.List;
import web.model.Car;

public class CarService {

    private final List<Car> carList = List.of(
            new Car("DeLorean DMC-12", 12, 1981),
            new Car("BMW Isetta", 300, 1955),
            new Car("Trabant", 601, 1964),
            new Car("Volkswagen Beetle", 1, 2019),
            new Car("Tesla Cybertruck", 1, 2023)
    );

    public List<Car> getCarListByAmount(int amount) {
        return carList.subList(0, amount);
    }

}
