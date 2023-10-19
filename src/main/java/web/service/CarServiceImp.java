package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private List<Car> car;

    public CarServiceImp() {
        car = new ArrayList<>();
        car.add(new Car(1,"red", "diesel", 180));
        car.add(new Car(2,"black", "diesel", 86));
        car.add(new Car(3,"yellow", "gasoline", 150));
        car.add(new Car(4,"blue", "diesel", 200));
        car.add(new Car(5,"white", "gasoline", 150));

    }

    @Override
    public List<Car> showCars(int count) {
        return car.stream().limit(count > 0 && count < 5 ? count : 5).collect(Collectors.toList());
    }
}
