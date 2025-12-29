
public class SalaryTax {
	
	public static void main(String[] args) {
		
		// here we have to determine how much tax will be applied on the persons salary
//		Accept a person's salary and apply tax:
//		Salary < 50,000 â†’ No Tax
//		50,000 to 1,00,000 â†’ 10% Tax
//		Above 1,00,000 â†’ 20% Tax
		
		
		
		double salary = 152000.54;
		System.out.println("Entered salary is: " + salary);
		System.out.println();
		if(salary < 50000) {
			System.out.println("No tax will be applied");
		}
		else if(salary >= 50000 && salary <= 100000) { // if one of the condition is true it will be true.
			System.out.println("10% tax will be applied on the salary");
			// now apply 10% and show output
			double a = 0.0;
			a = salary * 10/100;
			System.out.println("The salary with 10% tax is: " + a);
		}
		else  {
			System.out.println("20% tax will be applied on the salary");
			double b = 0.0;
			b = salary * 20/100;
			System.out.println("The salary with 20% tax is: " + b );
			
			// the code is successfully giving the tax amount to the user and help user to know their tax category
		}
		
		
	}

}
