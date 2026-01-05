
public class Greaternum {
	
	public static void main(String[] args) {
		
		// program to find the greatest number among three numbers.
		int a = 45;
		int b = 78;
		int c = 12;
		
		if(a >= b && a >= c) {
			System.out.println(a + " is the greatest number.");
		}
		else if(b >= a && b >= c) {
			System.out.println(b + " is the greatest number.");
		}
		else {
			System.out.println(c + " is the greatest number.");
		}
		
		// program to see the year is leap year or not.
		
		int year = 2021;
		if( (year % 4 == 0)){
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
		
	}

}
