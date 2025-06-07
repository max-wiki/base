package generic;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
    void add(List<T> l,Object o){
    l.add((T) o);
    }

    public static void main(String[] args) {
        Generics<String> generics = new Generics<String>();
        List<String> list = new ArrayList<>();
        list.add("a");
        generics.add(list,new Object());
        generics.add(list,new Integer(1));
        for(String s: list){ // generic in compile time checked and in runtime not checked , cast exception
            System.out.println(s);
        }
    }
}