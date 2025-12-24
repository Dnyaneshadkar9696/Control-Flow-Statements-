
public class CentuaryYear {
	
	public static void main(String[] args) {
		
		//Write a program to check if a year is leap year, and if leap, check if itâ€™s a century year.
		int year = 2000;
		if(year % 4 == 0) {
			System.out.println(year + " is a leap year.");
			if(year % 100 == 0) {
				
				// Century year is a year that is divisible by 100 and gives the remainder 0.
				System.out.println(year + " is a century year.");
			}
			else {
				System.out.println(year + " is not a century year.");
			}
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
