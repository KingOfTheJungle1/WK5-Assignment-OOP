package week5Assignment;

public class Classes {

	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student("Vincent", "Edeh", "555-123-4567", 20);
//		student1.firstName = "Vincent";
//		student1.lastName = "Edeh";
//		student1.gradeLevel = 20;
//		student1.phoneNumber = "555-123-4567";
//		
		student1.introduce();
		
		Student student2 = new Student("Tom", "Matt");
		student2.introduce(); // this will introduce or print ONLY the first and last name in the console without any phone number or grade level

	}

}
