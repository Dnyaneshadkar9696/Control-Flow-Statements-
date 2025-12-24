import java.util.Scanner;
public class Greater50 {
	
	public static void main(String[] args) {
		
		// Write a program to check whether a number is even, and if even, check whether itâ€™s greater than 
//		50.
		Scanner sk = new Scanner(System.in);
		System.out.println("Enter the positive number: ");
		int i = sk.nextInt();
		
		if(i%2 == 0) {
			System.out.println("It is a even number");
			if(i>50) {
				System.out.println("The number " + i + " is greater than 50" );
			}
			else {
				System.out.println("The number " + i + " is not greater than 50");
			}
		}
		else {
			System.out.println("It is an odd number");
		}
		
		
		
	}

}
