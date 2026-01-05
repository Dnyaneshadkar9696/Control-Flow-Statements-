
public class FactorialProblem {
	public static void main(String[] args) {
		
		// factorial of 5
		int a = 5;
		int sum = 1;
		for(int i = a; i>=1; i--) {
			sum = sum * i;
		}
		System.out.println("The factorial of the number is: "+ sum);
	}

}
