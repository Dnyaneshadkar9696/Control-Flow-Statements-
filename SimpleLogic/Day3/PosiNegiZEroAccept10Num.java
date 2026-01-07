import java.util.Scanner;
public class PosiNegiZEroAccept10Num {
	
	public static void main(String[] args) {
		// to accept 10 numbers and count how many are positive negative and zero
		
		Scanner sd = new Scanner(System.in);
		
		int countp = 0;
		int countn = 0;
		int zero = 0;
		System.out.println("Enter 10 numbers: ");
		
		for(int i = 1; i<= 10 ; i++) {
			int num = sd.nextInt(); // we will not store each value separetely , we just store in num and check
			if( num > 0 ) {
				countp++;
			}
			else if(num < 0) {
				countn++;
			}
			else {
				zero++;
			}
		}
		System.out.println("Positive numbers: "+ countp);
		System.out.println("Negative numbers: "+ countn);
		System.out.println("Zeros : "+ zero);
	}

}
