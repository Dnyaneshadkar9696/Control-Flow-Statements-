package SimplelogicDay5;

import java.util.Scanner;

public class ToaddDigit {
       public static void main(String[] args) {
//    		Question 2nd 
    	    Scanner th = new Scanner(System.in);
   		System.out.println("Enter the number to add its digit: ");
   		int b = th.nextInt();
   		//b=1234;
   		int add = 0;  //4,7,9,10
   		while( b>0) {//0!=0
   			int digit = b%10;//4,3,2,1
   			System.out.println(digit);
   			
			add = add + digit;
   			b = b/10;
   			
   		}
   		System.out.println("Ans -"+ add);
	}
}
