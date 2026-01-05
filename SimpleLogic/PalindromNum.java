
public class PalindromNum {
	public static void main(String[] args) {
		// number 121 and its reverse is 121
		// simple reverse number and check
		int a = 101;
		int b = a;
		int reverse = 0;
	
		while(a!=0) {
			int digit = a%10; // it will give me remainder
			
			reverse = reverse * 10 + digit;
			a = a/ 10;
			
		}
		if( reverse == b) {
			System.out.println("The number is palindrome ");
		}
		else {
			System.out.println("The number is not a palindrome ");
		}
		
	}

}
