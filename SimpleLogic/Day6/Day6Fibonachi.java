package SimplelogicDay5;

public class Day6Fibonachi {
	
	// fibonachi series using while loop
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int i = 1;
		int n = 10;
		while(i <= 8) {
			int c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
			i++;
		}
	}

}
