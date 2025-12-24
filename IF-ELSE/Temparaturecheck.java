import java.util.Scanner;
public class Temparaturecheck {
	
	public static void main(String[] args) {
		
		Scanner ud = new Scanner(System.in);
		System.out.println("Enter todays temparature: ");
		int todaysTemp = ud.nextInt();
		
		if( todaysTemp > 30) {
			System.out.println("->It is a hot day");
		}
		else {
			System.out.println("->It is a cold day");
		}
		
	}

}
