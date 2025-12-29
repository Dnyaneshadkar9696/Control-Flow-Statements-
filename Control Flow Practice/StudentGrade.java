import java.util.Scanner;
public class StudentGrade {
	
	public static void main(String[] args) {
		
		// Write a program to find grade of a student based on marks
		Scanner dj = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int e = dj.nextInt();
		
		if( e >= 90 ) {
			System.out.println("You got A grade in the test.");
		}
		else if( e >= 75 && e <= 89)
		{
			System.out.println("You got B grade in the test");
		}
		else if( e >= 75 && e <= 89)
		{
			System.out.println("You got B grade in the test");
		}
		else if( e >= 50 && e <= 74)
		{
			System.out.println("You got C grade in the test");
		}
		else if( e >= 35 && e <= 49)
		{
			System.out.println("You got D grade in the test");
		}
		else {
			System.out.println("You are FAIL");
		}
	}

}
