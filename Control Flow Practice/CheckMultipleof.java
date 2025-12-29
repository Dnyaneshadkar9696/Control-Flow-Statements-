
public class CheckMultipleof {
	
	public static void main(String[] args) {
		
		// Accept a number and check whether it is a multiple of 5 and 11 or not.
		
		int a = 9;
		if(a%5 == 0) {
			System.out.println("The number is multiple of 5");
			
		}else if(a%11 == 0){
			System.out.println("The number is multiple of 11");
			
		}else {
			System.out.println("The number is not multiple of 5 and 11");
		}
	}

}
