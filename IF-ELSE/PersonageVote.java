import java.util.Scanner;
public class PersonageVote {
	
	public static void main(String[] args) {
		
		// To check if the person can vote or not 
		// creating object for the scanner class
		Scanner yt = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int a = yt.nextInt();
		
		// we can include one or more condition in the bracket of contions using logical operators
		// mostly in IF-Else statement the Relational(Comparison) operator and Logical Operators are used it gives the answer in true or in false
		if(a >= 18 && a <= 100) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting");
		}
		
		
		
	}

}
