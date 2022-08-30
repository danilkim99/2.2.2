package web.service;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "1", "black"));
        carList.add(new Car("BMW", "2", "white"));
        carList.add(new Car("BMW", "3", "blue"));
        carList.add(new Car("BMW", "4", "red"));
        carList.add(new Car("BMW", "5", "green"));
    }
    @Override
    public List<Car> carsCount(int num) {
        return carList.stream().limit(num).collect(Collectors.toList());
    }
}
