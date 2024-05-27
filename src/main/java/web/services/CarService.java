package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    Car car1 = new Car("Toyota", "Camry", 1111111);
    Car car2 = new Car("BMW", "X5", 2222222);
    Car car3 = new Car("Ford", "Mustang", 3333333);
    Car car4 = new Car("Ford", "Explorer", 4444444);
    Car car5 = new Car("BMW", "M3", 5555555);
    private List<Car> carList = new ArrayList<>(List.of(car1, car2, car3, car4, car5));

    public List<Car> carsList() {
        return carList;
    }

    public List<Car> showMultipleCars(int quantity) {
        return carList.subList(0, quantity);
    }
}