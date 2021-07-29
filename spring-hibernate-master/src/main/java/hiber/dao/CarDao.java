package hiber.dao;

import hiber.car.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);
    List<Car> listCars();
}
