package hiber.service;

import hiber.car.Car;

import java.util.List;

public interface CarService {
    void add(Car car);
    List<Car> listCars();
}
