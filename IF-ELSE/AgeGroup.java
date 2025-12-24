import java.util.Scanner;
public class AgeGroup {
	
	public static void main(String[] args) {
		// Program to determine age group of the person.
		
		Scanner ce = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = ce.nextInt();
		
		if(age >= 0 && age <= 12) {
			System.out.println("The person is a Child.");
		}
		else if(age >= 13 && age <= 19) {
			System.out.println("The person is a Teenager.");
		}
		else if(age >= 20 && age <= 59) {
			System.out.println("The person is an Adult.");
		}
		else if(age >= 60) {
			System.out.println("The person is a Senior Citizen.");
		}
		else {
			System.out.println("Invalid age.");
		}
	 }

}
