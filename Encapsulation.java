package week5Assignment;

public class Encapsulation {

	//Encapsulation ONLY exposes the data to be used and hides other data objects by using an acceptable ACCESS MODIFIERS
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sally"); // the value or variable, Sally can now be mutated using the setter, setFirstName
		student.setPhoneNumber("123"); // here, the phone number will return 0 because our condition in the other class specified it must be > 9, but its just 3.
		student.setPhoneNumber("1234567890"); // this obeys the condition that the phone number must be > 9.
		student.introduce(); // the value or variable First Name, SALLY can now be accessed using getter

	}

}
