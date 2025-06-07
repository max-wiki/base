package java8;

import java.util.Comparator;

public class SortByCar implements Comparator<Car> {

    @Override
    public int compare(Car car, Car carTwo) {
        return car.year - carTwo.year;
    }
}
