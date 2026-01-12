package SimplelogicDay5;

public class Day6LcmWhieLoop {
	
	public static void main(String[] args) {
		
		int a = 22;
		int b = 18;
		int g = a; 
		int d = b;
		int div = 1;
		int hcf = 0;
		int lcm = 0;
		
		while(a >= div && b >=div) {
			// loop breaks when div becomes 19 as the smaller number is 18
			// this while loop will not break but the if condition will break;
			if(a%div==0 && b%div==0) {
				// hcf logic
				hcf = div;
			}
			div++;
		}
		
		lcm = (g*d)/hcf;
		System.out.println(lcm);
		
	}

}
