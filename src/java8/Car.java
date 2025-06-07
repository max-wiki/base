package java8;

public class Car {
    String name;
    int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name:'" + name + '\'' +
                ", year:" + year +
                '}';
    }
}
