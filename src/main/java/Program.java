

/**
 * @author Aashish Katwal
 */

final class FinalClass {
	int year = 2024;
	String day = "Tuesday";
}

public class Program {

	private static String name = "Shradha Khatiwada";
	private static int roll, semester;

	final String birthPlace = "Bhadrapur";

	static {
		roll = 211843;
		semester = 7;
	}

	public static void staticMethod() {
		System.out.println("This is a static method");
	}

//	Finals Method
	final public void finalMethod() {
		System.out.println("This is a final method");
	}

	public static void main(String[] args) {
		Program program = new Program();

		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll + " Semester: " + semester);

		staticMethod();

		System.out.println("Final Variable: " + program.birthPlace);
		program.finalMethod();

	}

}
