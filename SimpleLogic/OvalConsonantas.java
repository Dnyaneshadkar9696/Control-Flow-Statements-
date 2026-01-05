import java.util.Scanner;
public class OvalConsonantas {
	
	public static void main(String[] args) {
		
		Scanner iw = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char fh =  iw.next().charAt(0); // charAt(0) means first index character
		
		if(fh == 'a' || fh == 'e' || fh == 'i' || fh == 'o' || fh == 'u') {
			System.out.println("It is a Vowels");
		}
		else {
			System.out.println("It is Consonants");
		}
	}
  
}
