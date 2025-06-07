package generic;

public abstract class HashSet<T> implements Set<T> {
    @Override
    public boolean add(T t) {
        return false;
    }
}
