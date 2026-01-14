package Practise01;
import java.util.Scanner;
public class ReverseNum {
	
	public static void main(String[] args) {
		Scanner ct = new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		int num = ct.nextInt();
		
		int reverse = 0;
		
		while(num > 0) {
			int digit  = num%10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		System.out.println("The reverse number is: "+ reverse);
	}

}
