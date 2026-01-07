
public class Series1to20 {
	
	public static void main(String[] args) {
		int b = 20;
		for(int i= 1; i <= b; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("Another logic");
			for(int j = 2; j<= 20; j+=2) {
				System.out.println(j);
			}
			
	    System.out.println();
	}

}
