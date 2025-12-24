import java.util.Scanner;
public class Divby10 {
	
	public static void main(String[] args) {
		
		// Write a program to check whether a number is divisible by 10.
		Scanner du = new Scanner(System.in);
		System.out.println("Enter the positive number: ");
		int a = du.nextInt();
		
		if(a%10 == 0) {
			System.out.println("The number "+ a +" is divisible by 10 ");
		}
		else {
			System.out.println("The number "+ a +" is not divisible by 10");
		}
		}
		

}
