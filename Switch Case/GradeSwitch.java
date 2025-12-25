
public class GradeSwitch {
	
	public static void main(String[] args) {
	
		//4. Take a grade character (A, B, C, D, F) as input and print a message:
//		A â†’ Excellent
//		B â†’ Good
//		C â†’ Average
//		D â†’ Poor
//		F â†’ Fail
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("-> Excellent");
			break;
		case 'B':
			System.out.println("-> Good");
			break;
		case 'C':
			System.out.println("-> Average");
			break;
		case 'D':
			System.out.println("-> Poor");
			break;
		case 'F':
			System.out.println("-> Fail");
			break;
		default:
			System.out.println("Enter the right grade and run the program again.");
		}
	}

}
