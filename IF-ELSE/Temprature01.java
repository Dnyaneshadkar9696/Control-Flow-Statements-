
public class Temprature01 {
	
	public static void main(String[] args) {
		
//		Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
		
		int temperature = 25; 
		
		if(temperature >= 85) {
			System.out.println("It is Hot temperature: " + temperature);
		}
		else if(temperature >= 70) {
			System.out.println("It is Warm temperature: " + temperature);
		}
		else if(temperature >= 50) {
			System.out.println("It is Cool temperature: " + temperature);
		}
		else {
			System.out.println("It is Cold temperature: " + temperature);
		}
	}

}
