package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryIml implements CarRepository{
    private final List<Car> cars = new ArrayList<>();
    public CarRepositoryIml () {
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("model # " + i, 2005 + i, "carPhoto " + i));
        }
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
