public class Prime{
	
	public static void main(String[] args) {
		
		
		// Program for the prime number.
		int number = 70;
		// above is the number we want to check it is a prime number or not
		int temp = 0;
		for(int i=2; i <= number - 1; i++) {
			if(number%i == 0) {
				// i cant print the statement here because the loop will print it again and agan 
				temp = temp + 1;
			}
		}
		if(temp > 0) {
			System.out.println("It is not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
	}
}