
public class Nearestto100 {
	
	public static void main(String[] args) {
		
		// to check which number is nearest to the 100
		
		int a = 3;
		int b = 13;
		
		if(a <= 100) {
			if(a == b ) {
				System.out.println("Both the numbers are same");
			}
			else {
			
			if( a > b) {
				System.out.println("a is nearst to 100");
			}
			else {
				System.out.println("b is nearst to 100");
			}
			}
			
		}
		else {
			System.out.println("Enter the number between 1 to 100");
		}
	}

}
