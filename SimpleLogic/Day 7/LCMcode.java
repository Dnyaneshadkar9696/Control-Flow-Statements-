package Practise01;

public class LCMcode {
	
	public static void main(String[] args) {
		// to check the lcm 
		int a = 30; 
		int x = a; 
		int b = 60;
		int d = b;
		int hcf = 0;
		if(a > b) {
			for(int i=1; i <= a ; i++) {
				if(a%i == 0 && b%i ==0) {
					hcf = i;
				}
			}
			int lcm = (x*d)/hcf;
			System.out.println("Hcf "+ hcf);
			System.out.println("Lcm "+ lcm);
		}
		else {
			for(int j=1; j <= a ; j++) {
				if(b%j == 0 && a%j ==0) {
					hcf = j;
				}
			}
			int lcm = (x*d)/hcf;
			System.out.println("Hcf "+ hcf);
			System.out.println("Lcm "+ lcm);
		}
	}

}
