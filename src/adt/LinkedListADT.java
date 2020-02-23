package adt;

public interface LinkedListADT<E> {
    public void add(E firstName, E lastName, E number, E email);

    public E remove(E firstName);

    public void print();

    public int search(E firstName);
}
