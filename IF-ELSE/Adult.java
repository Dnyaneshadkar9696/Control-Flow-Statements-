import java.util.Scanner;

public class Adult {
	
	public static void main(String[] args) {
		
		//Write a program that checks if a persons age is greater than 18, then print "Adult"
		
		Scanner ou = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int h = ou.nextInt();
		
		if(h >= 18) {
			
		  System.out.println("You are an adult");
		}
		else {
			if(h <= 0) {
				System.out.println("Enter the positive value and run the program again. ");
			}
			else {
			System.out.println("You are a child");
			}
		}
		
		
	}
   
}
