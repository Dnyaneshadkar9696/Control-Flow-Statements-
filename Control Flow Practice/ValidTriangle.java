
public class ValidTriangle {
	
	public static void main(String[] args) {
		
		// to check weather the triangle is valid or not.
		// Accept three sides of a triangle and check whether it is valid or not (sum of any two sides > third side).
		
		int side1 = 1;
		int side2 = 1;
		int side3 = 1;
		
		int a = side1 + side2;
		int b = side2 + side3;
		int c = side3 + side1;
		
		if(a > side3 && b > side1 && c > side2){
			System.out.println("The triangle is valid");
		}
		else {
			System.out.println("The triangle is not valid");
		}
		
	}

}
