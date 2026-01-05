
public class SikipMulof5 {
	
	public static void main(String[] ars) {
		// to skip multiples of the 5
		// basic logic agar vo number 5 se divide hoga then it is multiple of 5
		int a = 1;
		int b = 5;
		for(int i = a; i <= 100 ; i++) {
			if( i%5 == 0 ) {
				continue;
			}
			System.out.println(i);
		}
	}

}
