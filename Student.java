package week5Assignment;

public class Student {
	
	static int numberOfStudents;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	public Student() {}
	
	//PUBLIC METHOD 1 CONSTRUCTOR 1
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//PUBLIC METHOD 2 CONSTRUCTOR 2
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
		
	}
	
	//PUBLIC METHOD 3
	public void introduce() {
		System.out.println("Hello! My name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	// for validation of all the SETTERS, we provide the "if statement"
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	// we have to create GETTERS and SETTERS for all the variables declared above one by one
	//setter
	public void setFirstName(String firstName) { // this returns nothing but takes in String parameter and prints the value, firstName when called into the console
		if (checkLength(firstName, 1)) // the length of the first name must be greater than 1
			this.firstName = firstName;
		
	}
	
	public String getFirstName() { // this does not take any parameter but return the String data type
		return firstName; // no need to use this. keyword here because there is no parameter will hide the variable with the name and return the value outside the method in our class scope Student
	}
	
	public void setLastName(String lastName) {
		if (checkLength(lastName, 1)) // the length of the last name must be greater than 1
			this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (checkLength(phoneNumber, 9)) // the number of the phone number must be greater than 9
			this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumeber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13)
			this.gradeLevel = gradeLevel;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
}