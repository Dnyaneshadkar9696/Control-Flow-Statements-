import java.util.Scanner;
public class LArgeSmallNum {
	public static void main(String[] args) {
		// to find the largest and smallest among the 10 numbers
		System.out.println("Enter the first number");
		Scanner oe = new Scanner(System.in);
		int b = oe.nextInt();
		int largest = b;
		int smallest = b;
		// here we are taking first number as reference;
		// we are storing first valuse for reference and based on that compating the remaining 9 values

		System.out.println("Enter the 9 numbers: ");
		for(int i= 2; i<=10; i++) {
			int num = oe.nextInt();
			if(num > largest) { // checking the entered number is big or small 
				largest = num;
			}
		    if( num < smallest) {
				smallest = num;
			}
			// we can use 2 if block if there is 2 conditions
		}
		System.out.println("Largest value: "+ largest);
		System.out.println("Smallest value: "+ smallest);
	}

}
