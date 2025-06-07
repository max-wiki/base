generic classes 
generic methods
erasure
generic solve problem code redundancy. For example, when we use 
void add(Object o){} 
this is work, but we need when a developer 
adds a user to list cannot add for next data to add an Integer.
type parameter determines class should a witch type
ArrayList, Map ... be a generic class, 
a parameter type should always be a class, cannot use primitive data type.
generic type or parameterized type
generic added from jdk 1.5
we can have a generic type that extends a class or interface for say data type should have extends of it.
for example, T extends Number, or E extends Comparable
we can create a new instance of generic without a set data type that says to it raw type.
for example :
ArrayList list = new ArrayList(); // this is a raw type 
list.add("Mohammad")
list.add(new Integer(5))
list.add(new Character('#'))
after java 1.7 , add type inference 
before java 1.7 : diamond operator is String 
ArrayList<String> list = new ArrayList<String>();
after java 1.7: diamond operator is empty , type inference
ArrayList<String> list = new ArrayList<>();
_________________________________________
class A{}
class B extends A{}
class Box<T> extends B{}
class IntList implement List<Integer>{
public boolean add(Integer e){}
}
interface NumberList<T extends Number> extends List<T>{}
class GenericClass<T> {
public <E> void f(E p1,T p2){}
}
interface NotGeneric{
public <E> E f(E p1); //generic method 
}
_____________________________________________
Erasure: type parameter checks only in compile time, 
in byte code you cannot find of type parameter 
Stack<Integer>
all generic type compiled as raw type 
for example :
// after compile java replace T as Comparable in byte code 
class SortedList<T extends Comparable>{}
_____
class Stack<T> {
void push(T t){}
T pop(){}
}
____
//after compile :
class stack {
void push(object s){}
Object pop(){}
}
_____
class SortedList<T extends Comparable<T>>{
T[] values;
public void add(T t){}
}
____
// after compile :
class SortedList{
Comparable[] values;
public void add(Comparable o){}
}
____
static <E extends Comparable<E>> E max(E p1,E p2){}
____
after compile :
static Comparable max(Comparable p1,Comparable p2)
_______________________________________________
javap -c Box.class // show byte code compiled 
________
why not work overload for this two method ?
public static <E extends Number> void f (E i){}
public static void f(Number i){}
get error in compile time :
Erasure of method f(E) is the same as another method 
_______________
erasure used in java , instansof and new not work in generic because java used erasure for generic types at run time 
class Stack<T>{
T ref = new T();
}
or
private static T obj; // generic cannot static 
or 
Stack<String> [] s = new Stack<String>[8]; // compile error
stack<int>[] s = new Stack<>[]; // can not set primitive for generic , compile error 
generic class can not extend from throwable class , T can extends Exception but class can not extends
this code has compiled error 
_______________
In Java Generics, a wildcard is represented by a question mark (?) and is used to specify an unknown type. Wildcards allow for more flexible method parameters, especially when you want to write code that works with a variety of generic types without knowing their exact types.

There are three main types of wildcards in Java:

1. Unbounded Wildcard: <?>
   Represents an unknown type.

Useful when you only need to work with objects and don't care about the specific type.

public void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}
You cannot add elements to a List<?> (except null) because the compiler doesn't know what type is allowed.

2. Upper Bounded Wildcard: <? extends T>
   Restricts the unknown type to be a subclass of T (including T itself).

Used when you want to read from a structure.

public void processNumbers(List<? extends Number> list) {
for (Number num : list) {
System.out.println(num.doubleValue());
}
}
You cannot add anything (except null) because you don’t know the exact type (it could be Integer, Double, etc.).

3. Lower Bounded Wildcard: <? super T>
   Restricts the unknown type to be a superclass of T (including T itself).

Used when you want to write to a structure.

public void addIntegers(List<? super Integer> list) {
list.add(1);
list.add(2);
}
You can add Integer (or subclasses), but when reading, you only get Object because the exact type is unknown.



