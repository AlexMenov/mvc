package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarRepository;
import web.dao.CarRepositoryIml;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceIml implements CarService {
    private final CarRepository carRepository;
    @Autowired
    public CarServiceIml (CarRepositoryIml carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars(int count) {
        return carRepository.getCars(count);
    }
}
