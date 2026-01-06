import java.util.Scanner;
public class OvalConsonantas {
	
	public static void main(String[] args) {
		
		// vowels are a e i o u 
		Scanner os = new Scanner(System.in);
		System.out.println("Enter the letter: ");
		char ch = os.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("The letter is Vowel");
		}
		else if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U') {
			System.out.println("The letter is Vowel");
		}
		else {
			System.out.println("The letter is Consonant");
		}
	}
  
}
