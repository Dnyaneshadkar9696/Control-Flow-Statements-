
public class CheckTriangle {
	
	public static void main(String[] args) {
		
		// Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene)
		
		int side1 = 3;
		int side2 = 5;
		int side3 = 5;
		

		if(side1 == side2 && side2 == side3) {
			System.out.println("It is an Equilateral triangle");
			// all sides are equal
		}
		else if(side1 == side2 || side2 == side3 || side1 == side3) {
			
			// when two sides are equal then it will be true in the case of or operator
			System.out.println("It is an Isosceles triangle");
			// two sides are equal
		}
		else {
		   	System.out.println("It is a Scalene triangle");
		}		// no sides are equal
	}

}
