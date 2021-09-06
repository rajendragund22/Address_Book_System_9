package com.bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book System code !!!");
        Scanner sc = new Scanner(System.in);
        AddressBookDe Book = new AddressBookDe();
        Book.getMenu();
        Book.showContact();
    }
}

class contactDetails { //Person object
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private String email;
    private Long zip;
    private Long phoneNumber;


    public contactDetails(String firstName, String lastName, String addressCity, String state, String email, Long zip, Long phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public contactDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNum(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "ContactDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

class AddressBookDe {
    Scanner sc = new Scanner(System.in);
    contactDetails person = new contactDetails();
    ArrayList<contactDetails> contactList = new ArrayList<>();

    public contactDetails addContact() {
        System.out.println("Enter the details of the contact");
        {
            System.out.println("Enter First Name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter last Name: ");
            String lastName = sc.nextLine();
            System.out.println("Enter your addressCity: ");
            String addressCity = sc.nextLine();
            System.out.println("Enter your state: ");
            String state = sc.nextLine();
            System.out.println("Enter your EMail ID: ");
            String email = sc.nextLine();
            System.out.println("Enter zip code : ");
            long zip = sc.nextLong();
            System.out.println("Enter phone number: ");
            long phoneNumber = sc.nextLong();
            contactList.add(new contactDetails(firstName, lastName, addressCity, state, email, zip, phoneNumber));
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAddressCity(addressCity);
            person.setState(state);
            person.setEmail(email);
            person.setPhoneNum(phoneNumber);
            person.setZip(zip);
            System.out.println("The Details Of Contact Is : " + person);
            return person;
        }
    }


    public void editContact() {
        System.out.println(" Enter the first name of the contact : ");
        String contactFirstName = sc.nextLine();
        if (contactList.isEmpty()) {
            System.out.println(" Contact List is Empty! ");
        } else {
            for (contactDetails person : contactList) {
                String checkName = person.getFirstName();
                if (checkName.equalsIgnoreCase(contactFirstName)) {
                    System.out.print("Enter New First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter New AddressCity: ");
                    String address = sc.nextLine();
                    System.out.print("Enter New State: ");
                    String state = sc.nextLine();
                    System.out.print("Enter New Email Id: ");
                    String email = sc.nextLine();
                    System.out.print("Enter New Zip Code of area: ");
                    long zip = sc.nextLong();
                    System.out.print("Enter New Mobile Number: ");
                    long phoneNumber = sc.nextLong();

                    person.setFirstName(firstName);
                    person.setLastName(lastName);
                    person.setAddressCity(address);
                    person.setState(state);
                    person.setEmail(email);
                    person.setZip(zip);
                    person.setPhoneNum(phoneNumber);
                    System.out.println("Contact List Updated! ");
                } else {
                    System.out.println(" Name not found. Enter Valid Name");
                }
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter the name of the contact to be deleted : ");
        String deleteName = sc.next();
        if (contactList.isEmpty()) {
            System.out.println("The AddressBook is Empty....!");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String matcher = contactList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)) {
                    contactList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                } else {
                    System.out.println("Name Not Found");
                }
            }
        }
    }


    public void showContact() {
        System.out.println("Total Number of Contacts : " + contactList.size());
        System.out.println("---------------------------------------------------");
        if (contactList.isEmpty()) {
            System.out.println("There are no contacts in the contact list");
        } else {
            System.out.println(contactList);
            System.out.println("\n---------------------------------------------");
        }
    }


    public void getMenu() {
        boolean exit = false;
        do {
            System.out.println("Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    System.out.println(person);
                    System.out.println("Contact added successfully....");
                    break;
                case 2:
                    editContact();
                    System.out.println(person);
                    System.out.println("Contact details updated successfully");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Enter the valid option!");
                    break;
            }
        } while (!exit);
    }
}
