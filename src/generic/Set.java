package generic;

import java.util.Collection;

public interface Set<E> extends Collection<E> {
    @Override
    boolean add(E e);
}
