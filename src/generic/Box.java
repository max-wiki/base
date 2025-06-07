package generic;

public class Box<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public Box(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
    Box<Integer> box = new Box<>(1);
    Box<Float> boxTwo = new Box<>(1.1F);

    }
}
