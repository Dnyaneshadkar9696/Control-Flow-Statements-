
public class SumofFactorialSeries {
	public static void main(String[] args) {
		// code to get the sum of factorial series till the nth value
		
		int n = 4; 
		int sum = 1;
		int Total = 0;
		for(int i = 1; i <= n ; i++) {
			// here we will be requiring 2 loops because we have to check till each number for each number
			for(int j = i; j <= i; j++) {
				sum = sum * j; // this statement will check for each number
				
			}
			Total = Total + sum;
			// storing each value of sum in total
			
		}
		System.out.println("Total sum of factorial series till n: "+ Total);
		
	}

}
