import java.util.Scanner;
public class Program01 {
	public static void main(String[] args) {
//		int a = 2; 
//		int b = 4; 
//		int sum;
//		System.out.println("Sum :" + (sum= a+b));
//		
//		
//		// second question profit and loss
//		System.out.println();
//	    int sp = 2500;
//		int cp = 2000;
//		
//		if(sp>cp) {
//			System.out.println("profit: "+ ( sp - cp));
//		}
//		else if(cp > sp) {
//			System.out.println("Loss: "+ ( cp - sp));
//		}
//		else {
//			System.out.println("No Loss no Profit");
//		}
//		
//		System.out.println();
//		// Third question - average of three numbers
//		int c = 8;
//		int average;
//		average = (a+b+c)/3;
//		System.out.println("The average is: " + average);
//		
//		System.out.println();
//		Scanner er = new Scanner(System.in);
//		System.out.println("Enter the two numbers: ");
//		int y = er.nextInt();
//		int x = er.nextInt();
//		System.out.println("Addition of  two numbers: "+ (y+x));
//		System.out.println("Substraction of  two numbers: "+ (y-x));
//		System.out.println("Multiplication of  two numbers: "+ (y*x));
//		System.out.println("Division of  two numbers: "+ (y/x));
//		
//		System.out.println();
//		// next question 4th
//		double pi = 3.141;
//		System.out.println("Enter the radius of circle");
//		double r = er.nextDouble();
//		System.out.println("Area of circle: "+ (pi *r *r));
//		// we can also use Math.pi built in class
//		
//		System.out.println();
		// 5th question
//		accept marks from user of five subjects and return average, totol and percentage
		int subMath = 80;
		int subScience = 79;
		int subChemistry = 67;
		int subPhysics = 88;
		int subHistory = 87;
		int theTotal;
		System.out.println("The Total of subjects is: "+ (subMath+subScience+subChemistry+subPhysics+subHistory));
		System.out.println();
		System.out.println("The average of 5 subjects is: "+ ((subMath+subScience+subChemistry+subPhysics+subHistory)/5));
		System.out.println("The percentage for 5 subjects is: "+ (((subMath+subScience+subChemistry+subPhysics+subHistory)/500.0)*100) +" %");
		// for percentage we have to divide by 500.0 to get decimal value
		
		
	}

}
