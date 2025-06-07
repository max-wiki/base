package generic;

import java.util.Random;

public class NotGeneric {
    // <T> is generic type data definition
    public <T> T chooseRandom(T p1, T p2) {
        if (new Random().nextFloat() > 0.5) {
            return p1;
        }
        return p2;
    }
    // <E extends Comparable> is a data definition
    // auto boxing E p1 ,E p2 , can have every type
    public static <E extends Comparable> E max(E p1, E p2) {
        return p1.compareTo(p2) > 0 ? p1 : p2;
    }
}
