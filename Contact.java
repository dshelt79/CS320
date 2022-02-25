package contactServ;
//Creating the contact class
public class Contact{
	//Creating the variables for the class for contact ID, first name, last name, phone number, and number address
	private String contactId;
	private String firstName;
	private String lastName;
	private String contactPhoneNum;
	private String contactAddress;
	
	//Creating a constructor with parameters for the variables 
	//Making throw IllegalArgumenExceptions for each variable
	public Contact(String contactId,String firstName, String lastName, String contactPhoneNum, String contactAddress) {
		if(contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(contactPhoneNum == null || contactPhoneNum.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException("Invalid Contact Address");
		}
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactPhoneNum = contactPhoneNum;
		this.contactAddress = contactAddress;
	}
	
	//Creating the getters and the setters for the variables//
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName(){
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
	public String getContactPhoneNum() {
		return contactPhoneNum;
	}
	public void setContactPhoneNum(String contactPhoneNum) {
		this.contactPhoneNum = contactPhoneNum;
	}
	
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	
	
	
}