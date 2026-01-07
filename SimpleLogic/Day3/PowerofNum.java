import java.util.Scanner;
public class PowerofNum {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = io.nextInt();
		System.out.println("Enter the power: ");
		int b = io.nextInt();
		int result = 1;
		for(int i = 1; i <= b; i++) {
			result = result * a;
			// not cimpulsory to take i as in the loop it runs when the loop will run
		}
		System.out.println("Answer is: " + result);
		
		
	}

}
