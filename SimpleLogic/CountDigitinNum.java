
public class CountDigitinNum {
	
	public static void main(String[] args) {
		int a = 65234234;
		int count = 0;
		
		// division by 10 will give the unit place and it will reduce one by one
		while ( a != 0 ) {
//			as  division will at the end will mark it zero 
			count++;
			a = a/10;
			// next loop value will be 1234 and next 123 and next 12 and 1 and 0
		}
		System.err.println("The count of digits is: "+count);
	}

}
