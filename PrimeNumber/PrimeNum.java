
public class PrimeNum {
	
	public static void main(String[] args) {
		
		// the number divisible by 1 and it self is a prime number 
		
		// in prime number we want to use if loop and break and continue
		
		int a = 25;
//		 the global variable so to access in side in the loop 
		int b = 1;
		// we have to check if it is divisible by any previous number till 6 and start from 2 as it is divisible by 1
		
		for(int i = 2; i <= a-1; i++) {
			if(a%i == 0) {
				// we have to do i % because the i will upadate till like 2 3 4 5
				b = i;
//				System.out.println("It is not a prime number ");
				break;
				}
			// above logic it will check the number is divisibel till its previous number and stops if so. 
//			else {
//				System.out.println("It is a prime number");
//				break;
//				// i cannot add else part here because the loop will stop checking the values further because if the if part is false it is directly executing the else part 
//				
			}
		// so we need third variable to access the inside loop
		if( a%b == 0) {
			System.out.println("It is not a prime number");
		
		}
		else {
			System.out.println("It  is a prime number ");
		}
		
	}

}
