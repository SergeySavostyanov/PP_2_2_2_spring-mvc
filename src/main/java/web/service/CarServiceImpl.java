package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {
    private static List<Car> list = new ArrayList<>();

    static {
        list.add(new Car("car1", 001, 1991));
        list.add(new Car("car2", 002, 1992));
        list.add(new Car("car3", 003, 1993));
        list.add(new Car("car4", 004, 1994));
        list.add(new Car("car5", 005, 1995));
    }

    public static List<Car> getList() {
        return list;
    }

    public static void setList(List<Car> list) {
        CarServiceImpl.list = list;
    }


    public static List<Car> carsListCount(Integer count) {
        List<Car> carList = new ArrayList<>();
        if (count == null || count >= 5) {
            carList = list;
        } else if (count <= list.size() && count >= 0) {
            carList = list.subList(0, count);
        }
        return carList;
    }
}
