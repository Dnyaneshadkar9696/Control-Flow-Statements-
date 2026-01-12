package SimplelogicDay5;

public class Day6NnaturalnumbersSum {
	
	public static void main(String[] args) {
		
		int n = 10;
		int i = 1; 
		int sum = 0;
		int square = 0;
		while(i <= n) {
		    sum = sum + i;
			i++;
		}
		System.out.println(sum);
		int j = 1;
		while(j <= n) {
			// 385
			square = square + (j * j);
			j++;
		}
		System.out.println(square);
	}

}
