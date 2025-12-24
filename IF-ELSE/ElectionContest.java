import java.util.Scanner;
public class ElectionContest {
	
	public static void main(String[] args) {
		
//		Write a program to check if a person is eligible to vote, and if eligible, check if they can 
//		contest in elections (age â‰¥ 25)
		
		Scanner ud = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = ud.nextInt();
		
		if(age >=18 && age <=100) {
			System.out.println("You are eligible to vote");
			if(age >= 25 && age <= 50) {
				System.out.println("You are eligible to contest in elections ");
			}
			else {
				System.out.println("You are not eligible to contest in elections.");
			}
		}
		else {
			System.out.println("You are not eligible to vote");
		}
		
		
		
		
	}

}
