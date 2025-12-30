
public class BreakContinue01 {
	
	public static void main(String[] args) {
		
		//
//		Print numbers from 1 to 50 but stop when number becomes 25.
		for(int i = 1; i <= 50; i++) {
			if(i == 25) {
				System.out.println(i);
				System.out.println("The number reached 25");
				break;
			}
			System.out.println(i);
		}
		
		// Question no 2nd 
		// Print even numbers from 1 to 100 but stop when you get first odd number.
//		System.out.println();
		for( int j = 1; j <= 100 ; j++) {
			if(j%2 == 1) {
				break;
			}
			System.out.println(j);
			System.out.println("Nothing will print as 1 is the first odd number.");
		}
		// nothing will print as 1 is an odd number
		
		
		// Question 3rd
		//Print table of 9 but stop when product becomes more than 50.
		
		System.out.println();
		for( int e = 1; e <= 10 ; e++) {
			
			if( 9*e > 50) {
				break;
			}
			System.out.println("9*"+ e +"= "+ (9*e));
		}
		
		// Question 4th
		// Print numbers from 1 to 50 but skip numbers divisible by 7.
		System.out.println();
		System.out.println("Skipping number divisible by 7");
		for( int f = 1; f<= 50; f++) {
			if(f%7 == 0) {
				continue;
			}
			System.out.println(f);
		}
		
		// Question 5th
//		Print numbers from 1 to 100 but skip numbers ending with digit 5.
		System.out.println();
		System.out.println("Skipping numbers ending with digit 5");
		for( int g = 1; g <= 100; g++) {
			if(g % 10 == 5) {
				// why used % 10 here because we need to check the last digit only
				// so to get the last digit we use modulus 10
//				detail explanation : when we divide any number by 10 the remainder will be the last digit of that number
				continue;
			}
			System.out.println(g);
		}
		
		//Question 6th
		//	Print characters from â€˜Aâ€™ to â€˜Zâ€™ but skip vowels.
		System.out.println();
		System.out.println("Skipping vowels from A to Z");
		for(char ch = "A".charAt(0); ch <= "Z".charAt(0); ch++) {
			// what is this charAt(0) and why we used it here?
			// charAt(0) is used to get the character at index 0 of the string "A" and "Z"
//			and convert it to char type so that we can use it in the for loop
			// does is means it stores the ASCII value of A and Z in ch variable?
			// yes it does store the ASCII value of A and Z in ch variable and we use it in for loop to iterate from A to Z
			
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				continue;
			}
			System.out.println(ch);
		}
		
		
		
		
		
		
		
		
	}

}
