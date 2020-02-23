package Person;

import LinkedList.LinkedList;

public class Person {
    public String firstName;
    public String lastName;
    public String number;
    public String email;
    LinkedList<String> linkedList = new LinkedList<String>();

    public void addContact(String firstName, String lastName, String number, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        linkedList.add(firstName, lastName, number, email);
        linkedList.sort();
    }
}
