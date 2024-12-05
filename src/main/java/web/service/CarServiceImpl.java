package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Skoda", "selver"));
        cars.add(new Car(++CARS_COUNT, "Ford", "black"));
        cars.add(new Car(++CARS_COUNT, "BMW", "blue"));
        cars.add(new Car(++CARS_COUNT, "Mazda", "red"));
        cars.add(new Car(++CARS_COUNT, "Honda", "white"));
    }

    @Override
    public List<Car> index() {
        return cars;
    }

    @Override
    public List<Car> getCars(int num) {
        return cars.stream().limit(num).toList();
    }
}
