package generic;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num = 4;
        list.add(num); // autoboxing cast int to Integer , wrap tp Integer , after java 1.5
        list.add(5); // autoboxing cast 5 to Integer

    }
}
