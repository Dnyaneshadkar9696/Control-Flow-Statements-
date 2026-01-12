package SimplelogicDay5;

public class Day6LCM{
	public static void main(String[] args) {
		
		// here we do find the lcm using the foor loop
		
		int a = 22; 
		int b = 18; 
		int x = a; 
		int y = b;
		int hcf = 0;
		int lcf = 0;
		
		
		for(int i= 1; i<=a; i++) {
			
			if(a%i ==0 && b%i ==0) {
				hcf = i; // here we got the higest common factor
				// what for lcm
			
			}
		}
		lcf = (x*y)/hcf;
		System.out.println(lcf);
		

			
			
			
	}
}
