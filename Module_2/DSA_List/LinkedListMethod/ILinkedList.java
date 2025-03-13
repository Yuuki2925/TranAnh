public interface ILinkedList<E> {
    void addFirst(E e);
    void addLast(E e);
    int size();
    E getFirst();
    E getLast();
    void clear();
}
