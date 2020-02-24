package main;

import Person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to VarunSaxena's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int num = scanner.nextInt();
            if (num == 1) {

                System.out.println("You have chosen to add a new contact: \n" +
                        "Please enter the name of the Person");
                scanner.nextLine();
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();
                //person.addFirstName(scanner.nextLine());
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                //person.addLastName(scanner.nextLine());
                System.out.print("Contact Number: ");
                String number = "";
                number = scanner.nextLine();
                //person.addPhoneNumber(scanner.nextInt());

                System.out.print("Would you like to add another contact number? (y/n): ");
                String ans1 = scanner.nextLine();
                String number1 = null;
                scanner.nextLine();
                if (ans1.equals("y")) {

                    System.out.print("Contact Number: ");
                    number1 = scanner.nextLine();
                    number = number + "," + number1;
                } else if (ans1.equals("n")) {
                    number = number;
                }
                System.out.print("Would you like to add email address? (y/n): ");
                String answer = scanner.nextLine();
                String email = null;
                System.out.print("Email address: ");
                if (answer.equals("y")) {
                    email = scanner.nextLine();
                } else if (answer.equals("n")) {
                    email = null;
                }
                person.addContact(firstName, lastName, number, email);

            } else if (num == 2) {
                person.viewContact();
            } else if (num == 3) {
                scanner.nextLine();
                System.out.print("You could search for a contact from their first names:");
                String value = scanner.nextLine();


                person.searchContact(value);
                //int totalValueMatched=linkedList.search(value);
                //System.out.println(totalValueMatched+" match found!");
                //Person person=new Person();
            } else if (num == 4) {
                System.out.println("Here are all your contacts:");
                person.printContactToRemove();
                System.out.print("Press the number against the contact to delete it: ");
                int position = scanner.nextInt();
                person.removeContact((position - 1));
                //Person person=new Person();
                //person.removeContact(scanner.nextLine());
            } else if (num == 5) {
                break;
            } else {
                System.out.println("EnvalidNumberFound");
            }
        }
    }
}
