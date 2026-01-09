package SimplelogicDay5;
import java.util.Scanner;
public class Day5 {
	
	public static void main(String[] args) {
		
//		while loop  initialization upwards and condition and updation in the loop
		Scanner th = new Scanner(System.in);
		// to print factorial of an number 
		System.out.println("Enter the number: ");
		int i = th.nextInt();
		int sum = 1;
		while(i !=0) {
			sum = sum * i;
			i--;
		}
		System.out.println("Ans - "+ sum);
	}

}
