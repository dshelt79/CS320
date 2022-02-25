package contactServ;
//Importing the aray list
import java.util.ArrayList;
// Creating the ContactService class
public class ContactService {
   //Making the list of contacts
   private ArrayList<Contact> contacts;

   //Creating a new constructor with a new array list for contacts
   public ContactService() {
       contacts = new ArrayList<>();
   }

   //Creating a boolean method to add contact into list if it does not already exist/
   public boolean add(Contact contact) {
       //Checking to see if contact already exists.
       boolean alreadyThere = false;
       for (Contact c : contacts) {
           if (c.equals(contact)) {
               alreadyThere = true;
           }
       }
       //Creating a new contact if contact not in list and outputting to user contact has been added
       //Making if and else statement to add contact or not add if contact exists
       if (!alreadyThere) {
           contacts.add(contact);
           System.out.println("Contact has been added to list.");
           return true;
       } 
       else {
           System.out.println("Contact already exists.");
           return false;
       }
   }

   //Creating a boolean method to remove a contact from list
   public boolean remove(String contactId) {
	   // Making a for loop with if statement to remove the contact and print to user contact removed
       for (Contact c : contacts) {
           if (c.getContactId().equals(contactId)) {
               contacts.remove(c);
               System.out.println("Contact has been removed.");
               return true;
           }
       }
       //Print to user that contact is not in list 
       System.out.println("Contact is not in list.");
       return false;
   }

   // Creating a boolean methos to update the contact information//
   public boolean update(String contactId, String firstName, String lastName, String contactPhoneNum,  String contactAddress) {
       //Creating a for loop with if statements to update the contact information
	   for (Contact c : contacts) {
           if (c.getContactId().equals(contactId)) {
               if (!firstName.equals(""))
                   c.setFirstName(firstName);
               if (!lastName.equals(""))
                   c.setLastName(lastName);
               if (!contactPhoneNum.equals(""))
            	   c.setContactPhoneNum(contactPhoneNum);
               if (!contactAddress.equals(""))
                   c.setContactAddress(contactAddress);
               System.out.println("Contact information has been updated.");
               return true;
           }
       }
	   //Printing to use the contact is not in list
       System.out.println("Contact is not in list.");
       return false;
   }

}

	
