package lets_code.lecture_java_files.prelims;
// come back and debug this: fix line 22

import java.util.Scanner;

class Methods {
	
	static void showFullName(String fname, String lname) {
		System.out.println("First Name: "+fname+"\nLast Name: "+lname);
	}
	
	static void showAge(int age) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your age is: "+age);
		System.out.println("We have something special. Do you want to try? (Yes/No): ");
		String answer = String.valueOf(scanner.nextLine());
		
		System.out.println(answer.toLowerCase() == "yes");
		
		if (answer.toLowerCase() == "yes") {
			System.out.println("Which year are we in: ");
			int currYear = Integer.valueOf(scanner.nextLine());
			
			int dob = currYear - age;
			System.out.println("You were born in the year: "+dob);
			
			System.out.println("Am I correct? (Yes/No) ");
			// boolean correct = Boolean.valueOf(scanner.nextLine());
		}
		
		else 
			System.out.println("All right then. Goodbye!!!");
		
	}
	
	public static void main(String[] args) {
		System.out.println(args);
		
		showFullName("Ife", "A-Olulesi");
		showAge(18);
	}
	
}