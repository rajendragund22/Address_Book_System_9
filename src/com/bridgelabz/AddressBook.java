package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book System code !!!");
            Scanner sc = new Scanner(System.in);
        AddressBookDe Book = new AddressBookDe();
            Book.addContact();//Calling Add Contacts Method
            System.out.println(Book.person);
            System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Book.editContact();
                    System.out.println("You have Entered following data");
                    System.out.println(Book.person);
                    System.out.println("Thank you for Using the Address book");
                    break;
                case 2:
                    Book.deleteContact();
                    System.out.println("Address Book details :" + Book.person);
                    break;
            }
        }
    }

class contactDetails {
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName
            (String lastName) {
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return
                        " FirstName : " + firstName +
                        " LastName : " + lastName +
                        " Address City : " + addressCity +
                        " State : " + state +
                        " Zip : " + zip +'\'' +
                        " PhoneNumber : " + phoneNumber +'\'' +
                        " Email : " + email;

    }
}
 class AddressBookDe {
     Scanner sc = new Scanner(System.in);

     contactDetails person = new contactDetails();

     public void addContact() {
         //contactDetails person = new contactDetails();
         System.out.println("Enter First Name: ");
         String firstName = sc.nextLine();
         System.out.println("Enter last Name: ");
         String lastName = sc.nextLine();
         System.out.println("Enter your addressCity: ");
         String addressCity = sc.nextLine();
         System.out.println("Enter your state: ");
         String state = sc.nextLine();
         System.out.println("Enter zip code : ");
         Long zip = sc.nextLong();
         sc.nextLine();
         System.out.println("Enter phone number: ");
         Long phoneNumber = sc.nextLong();
         sc.nextLine();
         System.out.println("Enter your EMail ID: ");
         String email = sc.nextLine();
         person.setFirstName(firstName);
         person.setLastName(lastName);
         person.setAddressCity(addressCity);
         person.setState(state);
         person.setZip(zip.intValue());
         person.setPhoneNumber(phoneNumber.intValue());
         person.setEmail(email);
         System.out.println("The Contact Details of " + firstName + "\n" + person);
     }


     public void editContact() {
         //Scanner editName = new Scanner(System.in);
         System.out.println("Enter the firstName of person");
         String editName = sc.nextLine();
         if (editName.equalsIgnoreCase(person.getFirstName()))
             addContact();
         else
             System.out.println("The Entered First Name Is Not Match");
         editContact();
     }
     public void deleteContact() {
         System.out.println("Enter firstName of the person");
         String editName = sc.nextLine();
         if (editName.equals(person.getFirstName())) {
             System.out.println("Deleted " + person.getFirstName() + " details");
             person = null;
         }
     }
 }
