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

    public void add(int index, E firstName, E lastName, E number, E email) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(firstName, lastName, number, email);
        } else {
            Node<E> temp = getNode(index - 1);
            addAfter(temp, firstName, lastName, number, email);
        }
    }

    String DeletedFirstName;
    String DeletedLastName;

    public E removeFirst() {
        E response = null;
        Node<E> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getFirstName();
            DeletedFirstName = (String) temp.getFirstName();
            DeletedLastName = (String) temp.getLastName();
        }
        return response;
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
