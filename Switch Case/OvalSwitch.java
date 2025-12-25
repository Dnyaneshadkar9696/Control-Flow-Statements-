import java.util.Scanner;
public class OvalSwitch {
	
	public static void main(String[] args) {
		
		//To check whether a character is a vowel or consonant using switch case.
		Scanner us = new Scanner(System.in);
		System.out.println("Enter the character: ");
		String ch = us.nextLine();
		
		//next.Line is used to store data in string.
		switch(ch) {
		
		case "a":
			System.out.println("The passed character is an oval");
			break;
		case "e":
			System.out.println("The passed character is an oval");
			break;
		case "i":
			System.out.println("The passed character is an oval");
			break;
		case "o":
			System.out.println("The passed character is an oval");
			break;
		case "u":
			System.out.println("The passed character is an oval");
			break;
		case "A":
			System.out.println("The passed character is an oval");
			break;
		case "E":
			System.out.println("The passed character is an oval");
			break;
		case "I":
			System.out.println("The passed character is an oval");
			break;
		case "O":
			System.out.println("The passed character is an oval");
			break;
		case "U":
			System.out.println("The passed character is an oval");
			break;
		default:
			System.out.println("The passed character is a consonant");
			
		}
		
	}

}
