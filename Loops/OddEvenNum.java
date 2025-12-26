
public class OddEvenNum {
	
	public static void main(String[] args) {
		
		// program to print the odd numbers between 1 to 50 and even numbers between 1 to 50
		
		System.out.println("The even numbers are as follows: ");
		for(int i=1;i<=50;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
		System.out.println( "The odd numbers are as follows:        ");
		for(int t = 1;t <= 50; t++) {
			if(t%2 == 1) {
				System.out.println(t);
			}
		}
	}

}
