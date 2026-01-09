package SimplelogicDay5;

public class Factorsof22 {
	
	public static void main(String[] args) {
		
		// question 6;
		 int num = 22;
	        int i = 1; // initialization

	        System.out.println("Factors of " + num + " are:");

	        while (i <= num) {
	            if (num % i == 0) {   // to till 22 and check as per the if condition
	                System.out.print(" "+i);
	            }
	            i++;
	        }
	
	}

}
