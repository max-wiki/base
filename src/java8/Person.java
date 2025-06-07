package java8;

import java.util.Date;

public interface Person {
    Date getBirthday();
    default String getName() {
        return "mohammad";
    }
}
