
public class MultiTable {
	
	public static void main(String[] args) {
		
		// printing the multiplication table using all the three loops
		int a = 13;
		System.out.println("The multiplication table using the for loop is as follows: ");
		
		for(int i= 1;i <=10 ;i++) {
			int b = a * i;
			System.out.println("13*"+i+" =" + b);
		}
		
		System.out.println();
		System.out.println("The multiplication table using while loop is as follows: ");
		
		int t= 16;
		int c = 1;
		while( c <= 10) {
			int d = t * c;
			System.out.println("16*"+c+" =" + d);
			c++;
		}
		
		System.out.println();
		System.out.println("The table of 17  using do-while loop is as follows: ");
		int x = 17;
		int s = 1;
		do {
			int k = x * s;
			System.out.println("17*"+s+" =" + k);
			s++;
		}while( s <= 10);
		
	}

}
