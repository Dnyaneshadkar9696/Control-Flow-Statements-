package Practise01;
import java.util.Scanner;
public class PrimeNum {
	
	public static void main(String[] args) {
		
		Scanner cr = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = cr.nextInt();
		int bull = 1; 
		for(int i = 2; i < num ; i++) {
			if(num%i == 0) {
				bull = bull - 1;
				break;
			}
		}
		if( bull == 1) {
			System.out.println("The number is a Prime number");
		}
		else {
			System.out.println("The number is not a Prime number");
		}
	}

}
