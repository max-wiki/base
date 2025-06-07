package generic;

public class LinkedListSample<E> {
    E item;
    LinkedListSample<E> next;

    LinkedListSample(E element, LinkedListSample<E> next) {
        this.item = element;
        this.next = next;
    }
}
