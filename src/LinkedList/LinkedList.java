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

    private E removeAfter(Node<E> node) {
        Node<E> temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
            size--;
        }
        return temp.getFirstName();
    }

    public E remove(int index) {
        E response = null;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();
        } else {
            response = removeAfter(getNode(index - 1));
        }
        return response;
    }

    public String printDeletedContact() {
        //String firstName= (String) this.getNode(index).getFirstName();
        //String lastName= (String) this.getNode(index).getLastName();
        return DeletedFirstName + " " + DeletedLastName;
    }

    int c = 0;

    @Override
    public void add(E firstName, E lastName, E number, E email) {
        add(size, firstName, lastName, number, email);
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            // fetch the data for the current node
            E firstName = this.getNode(i).getFirstName();
            E lastName = this.getNode(i).getLastName();
            E number = this.getNode(i).getNumber();
            E email = this.getNode(i).getEmail();
            System.out.println("-------- * -------- * -------- * --------");
            System.out.println("firstName : " + firstName);
            System.out.println("lastName : " + lastName);
            System.out.println("number : " + number);
            System.out.println("email : " + email);
            System.out.println("-------- * -------- * -------- * --------");
        }
    }

    @Override
    public E remove(E firstName) {
        return remove(size - 1);
    }

    @Override
    public int search(E firstName) {
        int response = 0;
        // write a loop to traverse the linked list
        for (int i = 0; i < size; i++) {
            // fetch the data of the current node
            E data = this.getNode(i).getFirstName();
            String data1 = (String) data;
            // check if the item is equal to the data of the current node
            if (data1.contains((String) firstName)) {
                response = response + 1;
            }
        }
        return response;
    }

    public void searchValue() {
        int response = -1;

        // write a loop to traverse the linked list

        for (int i = 0; i < size; i++) {
            // fetch the data of the current node

            String firstName = (String) this.getNode(i).getFirstName();

            if (firstName.contains((String) firstName)) {
                firstName = (String) this.getNode(i).getFirstName();
                String lastName = (String) this.getNode(i).getLastName();
                String number = (String) this.getNode(i).getNumber();
                String email = (String) this.getNode(i).getEmail();

                System.out.println("-------- * -------- * -------- * --------");
                System.out.println("firstName : " + firstName);
                System.out.println("lastName : " + lastName);
                System.out.println("number : " + number);
                System.out.println("email : " + email);
                System.out.println("-------- * -------- * -------- * --------");
            }
        }
    }

}
