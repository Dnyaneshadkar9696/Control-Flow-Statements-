public class PrimeNum1to100{
	
	public static void main(String[] args) {
         int a = 101;
         
		for(int i = 2; i < a ; i++) {
			// using one for loop 
			// value of a should also change
			int b = 1;  // every time we are thinking it is a prime number and then checking.
			for(int j= 2; j < i; j++) {
//				2 < 3 so direcly print the i
				if(i%j == 0) {
					b = b-1;
					break;
					
				}
				
			}
			if(b == 1) {
				System.out.println(i);
			}
			
		}
		
	}
}