
public class TwoloopSeries {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 5 ; i++) {
			System.out.print(" "+i);
		}
		for(int j = 4; j >=1; j--) {
			System.out.print(" "+j);
		}
		
		System.out.println();
		int sum = 1; 
		for(int k = 1 ; k <=3 ; k++) {
			System.out.print(" "+sum);
			sum = sum * 10;
		}
		System.out.print(" "+sum);
		
	    sum = sum/10;
		for(int v = 1 ; v <=2 ; v++) {
			System.out.print(" "+sum);
		    sum = sum / 10;
		}
		System.out.print(" "+sum);
		
	}

}
