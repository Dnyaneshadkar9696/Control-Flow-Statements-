
public class PrimeFrist10 {
	
	public static void main(String[] args) {
		
		// printing till the first 10 prime numbers are found
		
		int count = 0; // the count will increase when the prime number is found 
		int number = 2; // as the prime number will start from to and continue
		
		while(count < 10) {
			
			boolean t = true; // true
			for(int i = 2; i <= number-1;i++) {
				// will check using this for loop if the number is divisibel or not 
				if(number % i == 0) {
					// check the number all its previous values 
					t = false;
					break;
				}
				
			}
			if(t == true) {
				System.out.println(number);
				// we found prime number so increase the count 
				count++;
			}
			number++; // also increase the number
			
		}
	}

}
