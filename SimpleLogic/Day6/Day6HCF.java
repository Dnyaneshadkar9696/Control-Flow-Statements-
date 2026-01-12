package SimplelogicDay5;

public class Day6HCF {
	
	public static void main(String[] args) {
		
		int a = 270; 
		int b = 192;
//		int divisor = 0;
		int hcf = 0;
		
		if(a > b) {
			
		// a greater asel tevha this block will execute
		for(int i=1 ; i <= a; i++) {
			
			if(a%i == 0 && b%i==0) {
//				above condition will find the common number that divides both the numbers
//				for this example 6 is the higest common factor
				hcf = i;
			}
		}
		System.out.println(hcf);
		
		}
		
		else {
//			when b is greater then this block will be executed
			for(int j = 1; j <= b; j++) {
				if(b%j == 0 && a%j == 0) {
					hcf = j;
				}
			}
			System.out.println(hcf);
		}
		
	
	
	}

}
