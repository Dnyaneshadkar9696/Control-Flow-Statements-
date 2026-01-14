package Practise01;
import java.util.Scanner;
public class EvenOdd {
	
	public static void main(String[] args) {
		// to take range and in that range print prime number and odd number
		
		Scanner fd =  new Scanner(System.in);
		System.out.println("Enter the number till we want the prime and odd numbers");
		int range = fd.nextInt();
		System.out.println("Even numbers: ");
		for(int i= 1; i<=range; i++) {
		
			if(i%2 == 0) {
				
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		System.out.println("Odd numbers: ");
		for(int j= 1; j<=range; j++) {
			
			if(j%2 == 1) {
				
				System.out.print(j+ " ");
			}
		}
		
	}

}
