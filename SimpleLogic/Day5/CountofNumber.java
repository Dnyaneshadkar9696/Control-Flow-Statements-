package SimplelogicDay5;

import java.util.Scanner;

public class CountofNumber {
      public static void main(String[] args) {
    		// question 3
    	    Scanner th = new Scanner(System.in);
  		System.out.println("Enter the number: ");
  		int num = th.nextInt();
  		int count  = 0;
  		while(num > 0) {
  			int digit = num %10;
  				count++;
  				num = num / 10;
  		}
  		System.out.println("Ans -"+ count);
	}
}
