package contactServ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Creating ContactTestService class
public class ContactTestService {
	//Testing the add method for the contact list
	@Test
	   public void testMethodAddPass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("C123", "Douglas", "Smith", "6315557898", "1313 Mockingbird Lane");
	       Contact c2 = new Contact("C213", "David", "Shelt", "6315555355", "1313 Mockingbird Lane");
	       Contact c3 = new Contact("C312", "Christina", "Rose", "6315559845", "43 Fifth Ave");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	   }

	   //Testing the add method to fail when list attempts to me added twice//
	   @Test
	   public void testMethodAddFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("C123", "Douglas", "Smith", "6315557898", "1313 Mockingbird Lane");
	       Contact c2 = new Contact("C213", "David", "Shelt", "6315555355", "1313 Mockingbird Lane");
	       Contact c3 = new Contact("C312", "Christina", "Rose", "6315559845", "43 Fifth Ave");
	       assertEquals(true, cs.add(c1));
	       assertEquals(false, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	   }

	   //Testing the delete method with passing tests//
	   @Test
	   public void testMethodDeletePass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("C123", "Douglas", "Smith", "6315557898", "1313 Mockingbird Lane");
	       Contact c2 = new Contact("C213", "David", "Shelt", "6315555355", "1313 Mockingbird Lane");
	       Contact c3 = new Contact("C312", "Christina", "Rose", "6315559845", "43 Fifth Ave");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));

	       assertEquals(true, cs.remove("C312"));
	       assertEquals(true, cs.remove("C213"));
	   }

	   //Testing the delete method with failing tests
	   @Test
	   public void testMethodDeleteFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("C123", "Douglas", "Smith", "6315557898", "1313 Mockingbird Lane");
	       Contact c2 = new Contact("C213", "David", "Shelt", "6315555355", "1313 Mockingbird Lane");
	       Contact c3 = new Contact("C312", "Christina", "Rose", "6315559845", "43 Fifth Ave");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));

	       assertEquals(false, cs.remove("C004"));
	       assertEquals(true, cs.remove("C213"));
	   }

	   //Testing the update method with passing tests//
	   @Test
	   public void testUpdatePass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("C123", "Douglas", "Smith", "6315557898", "1313 Mockingbird Lane");
	       Contact c2 = new Contact("C213", "David", "Shelt", "6315555355", "1313 Mockingbird Lane");
	       Contact c3 = new Contact("C312", "Christina", "Rose", "6315559845", "43 Fifth Ave");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));

	       assertEquals(true, cs.update("C312", "Sean", "Paul", "6312638754",  "437 Greis Ave"));
	       assertEquals(true, cs.update("C213", "Jimmy", "Bush", "6315554367", "1310 Mock Lane"));
	   }

	   //Testing the update method with failing tests
	   @Test
	   public void testUpdateFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("C123", "Douglas", "Smith", "6315557898", "1313 Mockingbird Lane");
	       Contact c2 = new Contact("C213", "David", "Shelt", "6315555355", "1313 Mockingbird Lane");
	       Contact c3 = new Contact("C312", "Christina", "Rose", "6315559845", "43 Fifth Ave");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));

	       assertEquals(false, cs.update("C004", "Sean", "Paul", "6312638754", "437 Greis Ave"));
	       assertEquals(true, cs.update("C213", "Jimmy", "Bush", "6315554367", "1310 Mock Lane"));
	   

	}


}
