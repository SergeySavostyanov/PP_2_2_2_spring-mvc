package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {
    @Autowired
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


    public static List<Car> CarsListCount(Integer Count) {
        List<Car> carList = new ArrayList<>();
        if (Count == null || Count >= 5) {
            carList = list;
        } else if (Count <= list.size() && Count >= 0) {
            for (int c = 0; c < Count; c++) {
                carList.add(list.get(c));
            }
        }return carList;
    }
}
