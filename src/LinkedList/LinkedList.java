package LinkedList;

import adt.LinkedListADT;

public class LinkedList<E> implements LinkedListADT<E> {

    private class Node<E> {
        private Node<E> next;
        private E firstName;
        private E lastName;
        private E number;
        private E email;

        private Node(E firstName, E lastName, E number, E email, Node<E> next) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.number = number;
            this.email = email;
            this.next = next;
        }

        private Node(E firstName, E lastName, E number, E email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.number = number;
            this.email = email;
        }

        public Node<E> getNext() {
            return next;
        }

        public E getLastName() {
            return lastName;
        }

        public E getNumber() {
            return number;
        }

        public E getEmail() {
            return email;
        }

        public E getFirstName() {
            return firstName;
        }
    }

    int size = 0;
    private Node<E> head = null;

    private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    public void addFirst(E firstName, E lastName, E number, E email) {
        Node<E> n = new Node<>(firstName, lastName, number, email, head);
        head = n;
        size++;
    }

    private void addAfter(Node<E> node, E firstName, E lastName, E number, E email) {

        Node<E> n = new Node<>(firstName, lastName, number, email, node.next);
        node.next = n;
        size++;
    }

    @Override
    public void add(E firstName, E lastName, E number, E email) {

    }

    @Override
    public E remove(E firstName) {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public int search(E firstName) {
        return 0;
    }
}
