package java8;

import java.util.Date;

public class Student implements Person {
    @Override
    public Date getBirthday() {
        return new Date();
    }
    //when not implement Person name method use from default implementation

/*    @Override
    public String getName() {
      //  return Person.super.getName();
        return "akbar";
    }*/
}
