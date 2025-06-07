package java8;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pride",1390));
        cars.add(new Car("violet",1320));
        cars.add(new Car("kia",1392));
        Collections.sort(cars,new SortByCar());
        System.out.println(cars);
        for(Car car : cars){
            System.out.println(car);
        }
    }
}
