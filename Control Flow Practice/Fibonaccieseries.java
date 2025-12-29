
public class Fibonaccieseries {
	public static void main(String[] args) {
		
		// what is fibonacci series 
		// it is like sum of previous two numbers 
		
//		Print Fibonacci series up to 10 terms using for loop.
		int a = 0;
		int b = 1;
		
		System.out.print(a +" "+ b+" ");
	
		for( int i =0;i <= 10;i++) {
	
		
		int c = a+b;
		System.out.print(c +" ");
		a = b;
		b = c;
			
			
		}
		
		
		
		
	}

}
