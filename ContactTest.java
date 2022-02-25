package contactServ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;


//Creating ContactTest class//
class ContactTest {

	@Test
	void testContact() {
		//Creating contructor and asserting parameters are true 
		Contact contact = new Contact("C1234", "Doug", "Smith", "6315557643", "1313 Mock Lane");
	    assertTrue(contact.getContactId().equals("C1234"));
	    assertTrue(contact.getFirstName().equals("Doug"));
	    assertTrue(contact.getLastName().equals("Smith"));
	    assertTrue(contact.getContactPhoneNum().equals("6315557643"));
	    assertTrue(contact.getContactAddress().equals("1313 Mock Lane"));
	}
	@Test
	//Making contactID too long and testing
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C12345678910", "Doug", "Smith", "6315557643", "1313 Mock Lane");
		
		});
		
	}
	
	@Test
	//Making firstName too long and testing
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C1234", "DouglasMichael", "Smith", "6315557643", "1313 Mock Lane");
		});
	}
	//Making lastName too long and testing
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C1234", "Doug", "Smithmichaelsteen", "6315557643", "1313 Mock Lane");
		});
	}
	//Making phoneNum too long and testing
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C1234", "Doug", "Smith", "6315557643456", "1313 Mock Lane");
		});
	}
	//Making contactAddress too long and testing
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C1234", "Doug", "Smith", "6315557643456", "13387687622213 Southwestern Mockingbird Lane Southwest by Southwestern");
		});
	}



}
