package Practise01;
import java.util.Scanner;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner ft = new Scanner(System.in);
		System.out.println("Enter count of number to print the series: ");
		int num = ft.nextInt();
		
		int a = 0;
		int b = 1; 
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i = 1; i <= num ; i++) {
			
			int c = a + b;
			System.out.print(c+" ");
			a = b; 
			b = c;
		}
	}

}
