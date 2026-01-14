package Practise01;
import java.util.Scanner;
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		// 153
		Scanner sf = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = sf.nextInt();
		int e1 = num;
		int actualnum = num;
		int count = 0;
		
		// lets count the count
		while(num >0) {
			count++;
			num = num/10;
		}
//		System.out.println(count);
		int total = 0;
		while(e1 > 0) {
			int digit  = e1 % 10;
			
			int i = 1; 
			int sum = 1;
			
			while(i <=count) {
				sum = sum * digit;
				i++;
			}
			total = total + sum;
			e1 = e1/10;
		}
		if(actualnum == total) {
			System.out.println("The number is Armstrong number");
		}
		else {
			System.out.println("The number is not an Armstrong number");
		}
		
	}

}
