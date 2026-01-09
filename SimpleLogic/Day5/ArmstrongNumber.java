package SimplelogicDay5;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		// Question 5;
//		
		int a = 8208;
		int n1 = a; 
		int n2 = a;
		int count  = 0; 
        
		while( n1 > 0) {
			count++;
			n1 = n1/10;  // in this first loop we are calculating the count
		} 
		
		int total = 0;
		    while(n2 > 0) {
            int digit = n2%10;
//            we got 4
            int i = 1; 
            int sum = 1;
            while(i <= count) {
            	   sum = sum * digit;
//            	   sum value will be updated to 16
//            	   this loop will run again meants 4 times as per the count;
            	   i++; 
            	   // loop will run 4 times and value of sum is 16 
            }
            total = total +sum;
            // we strore the sum value in total 
            n2 = n2/10;
		}
		
		
		
		if(a == total) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong number ");
		}
	}

}
