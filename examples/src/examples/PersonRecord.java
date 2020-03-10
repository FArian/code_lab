package examples;

public class PersonRecord {
	private String firstName, lastName;
	public PersonRecord(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	@Override
	public String toString() {
		return "PersonRecord [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	

}
