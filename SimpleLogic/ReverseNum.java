
public class ReverseNum {
	public static void main(String[] args) {
		// here we have to reverse a number 
		
		int a = 12345;
		
		// when i % the num by 10 it will give me the unit place digit
		int reverse = 0;
		int count = 0;
		while(count < 5) {
			
			int digit = a%10;
			// we are storing the 5 in digit
			
			reverse = reverse * 10 + digit;
			// firstly in reverse we store the 5 then 4 and then 321 like wise
			
			a = a/10; // this division will decrease with the loop 
			// it will give me 1234
			count++;
		}
		System.out.println(reverse);
	}

}
