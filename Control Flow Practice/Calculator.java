import java.util.Scanner;

class Calculator {
	
	public static void main(String[] args) {
		
		// here we have to create the calculator using the switch case in java.
		int a = 0;
		int b = 0;
		int c =0;
		int d = 0;
		// First take two numbers from the user to perform the calculation.
		Scanner iu = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = iu.nextInt();
		System.out.println("Enter the second number: ");
		b = iu.nextInt();
		// now the values are stored in the variables
		System.out.println("so the value of a = " + a + " and the value of b = " + b );
		// using switch case user needs to select which arithmetic operator need to be used for calculation
		
		System.out.println(" ");
		System.out.println("Select the number according to given below");
		System.out.println("Press 1 for -> +");
		System.out.println("Press 2 for -> -");
		System.out.println("Press 3 for -> *");
		System.out.println("Press 4 for -> /");
		System.out.println("Press 5 for -> %");
		System.out.println(" ");
		System.out.println("Enter the nubmber to perform calulation: ");
		c = iu.nextInt();
		
		switch(c) {
		case 1:
			d =a+b;
			System.out.println("The Addition of two numbers is: " + d);
			break;
		
		case 2:
			d =a-b;
			System.out.println("The Substraction of two numbers is: " + d);
			break;
			
		case 3:
			d =a*b;
			System.out.println("The Multiplication of two numbers is: " + d);
			break;
			
		case 4:
			d =a/b;
			System.out.println("The Division of two numbers is: " + d);
			break;
			
		case 5:
			d =a%b;
			System.out.println("The Modulus of two numbers is: " + d);
			break;
			
		default : 
			System.out.println("Enter the correct value");
			
			
		}
		
	}

}
