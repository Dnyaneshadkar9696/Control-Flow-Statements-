import java.util.Scanner;
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// Armstrong number ex 153 there are 3 numbers 1 cube 5 cube and 3 cube is equal to 153 so it is an armstrong number
		
		Scanner os = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int num = os.nextInt();
		int originalNum = num;
//		int last = 0;
		int sum = 0;
//		int count =0;
		
		
		while (num > 0) {
			int digit = num%10; // it will give last digit
//			count++;
	
			sum= sum + (digit * digit * digit);
			num = num/10;
			
		}
		if(sum == originalNum) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}
	}

}
