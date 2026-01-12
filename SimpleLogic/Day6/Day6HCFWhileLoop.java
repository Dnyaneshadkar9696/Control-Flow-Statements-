package SimplelogicDay5;

public class Day6HCFWhileLoop {
	
	public static void main(String[] args) {
		
		// to find the hcf using the while loop
		
		int a = 48; 
		int b = 180;
		int div = 1;
		int hcf = 0;
		
		// div should be roaming
		while(a >= div && b >= div) {
			
			// a and b chi value reduce karu in furthe loops
			
			if(a%div ==0  && b%div ==0) {
				hcf = div;
			}
			 div++;
			
			
		}
		System.out.println(hcf);
	}

}
