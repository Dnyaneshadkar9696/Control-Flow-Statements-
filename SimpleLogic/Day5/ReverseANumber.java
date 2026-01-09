package SimplelogicDay5;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		// question 4
		int f = 3443;
		int b = f;
		int reverse = 0;
		while (f !=0 ) {
			int digit = f%10;
			reverse = reverse *10 + digit;
			
			f = f / 10;
			
		}
		if(reverse == b) {
			
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println(" The number is not a palindrome");
		}
		System.out.println("Ans -"+ reverse);
	}

}
