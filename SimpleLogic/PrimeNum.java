
public class PrimeNum {
	
//	to check the number is prime or not
	public static void main(String[] args) {
		
	
	int a = 26;
	int bull = 1;
	for(int i=2; i < a; i++) {
		if(a%i == 0) {
			bull = bull - 1;
			break;
		}
	}
	if(bull == 1) {
		System.out.println("It is a prime number");
	}
	else {
		System.out.println("It is not a prime number");
	}
   
   }

}
