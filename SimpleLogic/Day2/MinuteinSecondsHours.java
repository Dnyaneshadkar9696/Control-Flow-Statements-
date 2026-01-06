import java.util.Scanner;
public class MinuteinSecondsHours {
	public static void main(String[] args) {
		
		// to convert hours in minutes and seconds
		// 1hr = 60 min
		// 60min = ?
		
		// 1 min = 60 sec
		Scanner so = new Scanner(System.in);
		int Minutes = 0;
		int seconds60 = 0;
		int b = 60;
		for(int i = 1; i <= 60; i++) {
			seconds60 = seconds60 + b;
		}
//		System.out.println(seconds60); // we got 3600 seconds in 60 minutes 
		System.out.println("Enter the number of hours: ");
		int num = so.nextInt();
	    if(num <0) {
	    	System.out.println("Enter the positive number");
	    }
	    else {
	    	for(int i = 1; i <= num ; i++) {
	    		Minutes = b * i;
	    	}
	    	System.out.println("Minutes: "+ Minutes);
	    	// for seconds we multiply 3600 with number of hours
	    	System.out.println("Seconds: "+ seconds60*num);
	    }
	    
	}

}
