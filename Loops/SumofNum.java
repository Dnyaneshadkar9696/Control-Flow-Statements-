
public class SumofNum {
	
	public static void main(String[] args) {
		
		// programm to print sum of first 10 natural numbers using for loop
		int c = 0;
		for(int i =1; i <= 10; i++) {
			c = c + i;
		}
		System.out.println("The sum of first 10 natural numbers is as follows: " + c);
		int d = 0;
		System.out.println(" ");
		// now the sum of even numbers from 1 to 100
		for(int j = 1;j <= 100;j++) {
			if(j%2 == 0) {
				d = d + j;
			}
		}
		System.out.println("The sum of Even numbers from 1 to 100 is: "+ d);
		System.out.println("");
		int f = 0;
		for(int n = 1;n <= 100;n++) {
			if(n%2 == 1) {
				f = f + n;
			}
		}
		System.out.println("The sum of Odd numbers from 1 to 100 is: "+ f);
		
		
		
		
		
		
		
	}

}
