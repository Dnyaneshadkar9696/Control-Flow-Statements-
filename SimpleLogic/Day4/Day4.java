
public class Day4 {
	public static void main(String[] args) {
		// square pattern
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <=4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int k = 1; k <= 4; k++) {
			for(int z = 1; z <= 4; z++) {
				System.out.print(k+" "); // we can also pring k
			}
			System.out.println();
			
		}
		System.out.println();
		int n = 1;
		for(int c = 1; c <= 4; c++) {
			for(int d = 1; d <= 4; d++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		System.out.println();
		for(int h = 1; h <= 4; h++) {
			for(int b = 1; b<=h ; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int p = 4; p >=1; p--) {
			for(int u = 1; u <= p; u++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int w = 1; w <=3 ; w++) {  
			int value = 65;
			for(int g = 1; g <= 3; g++) {// we can  also do char w = 'A' ; w<= 'C'
				System.out.print((char)value+" "); // and print ch
				value++; // here we are using the ascii value
			}
			System.out.println();
			
		}
		
		
		
		System.out.println();
		for(int o = 1 ; o <= 4; o++) {
			for(char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int e= 1; e <= 3; e++) {
			for(int q = 1 ; q<=5; q++) {
				if(e==2) {
					System.out.print("# ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int y = 1; y <= 5; y++) {
			for(int z = 1; z<=5; z++) {
				if(y == 3 || z==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		for(int t = 1 ; t <= 3; t++) {
			for(int r = 1 ; r <= 5; r++) {
				if(t == 2 && r > 1 && r < 5) {
					System.out.print("* ");
				}
				else {
					System.out.print("# ");
				}
			
			}
			System.out.println();
			
		}
		System.out.println();
		String cif = "Dnyanesh";
		int count= 0;
		
		for(int i = 0; i < cif.length(); i++) {
			char ch = cif.charAt(i);
			// we are using i as int and storing the 0th index value in char ch and then checking the char using if condition
			if(ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u') {
				count++;
			}
			
		}
		System.out.println("Number of Vowels: "+count);
	}

}
