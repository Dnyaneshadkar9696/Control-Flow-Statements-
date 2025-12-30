
public class PrimeNumber10 {
	
	public static void main(String[] args) {
		// the 1 to 10 prime numbers
		
		// here we will required  two for loops one for the prime and one for values 
		int b = 10;
		
		for( int i = 2; i <= b; i++) {
			int temp = 1;
			// temp helps to identify if it is prime or not. 1 is not prime and 0 is prime according to the condition.
			// Second for loop for prime number
			for( int j = 2; j <= i-1; j++ ) {
				
				if( i%j == 0 ) {
					temp = temp - 1;
					break;
				}
			
				}
			if(temp == 1)
			{
				System.out.println(i);
			}
		}
		
	}

}
