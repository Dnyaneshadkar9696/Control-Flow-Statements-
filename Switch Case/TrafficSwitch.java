
public class TrafficSwitch {
	public static void main(String[] args) {
		
		// 5. Take a traffic light color (Red, Yellow, Green) as input and print the action:
		// Red â†’ Stop
		// Yellow â†’ Ready
		// Green â†’ Go
		
		String lightColor = "yellow";
		
		switch(lightColor) {
		case "Red":
			System.out.println("-> Stop");
			break;
		case "Yellow":
			System.out.println("-> Ready");
			break;
		case "Green":
			System.out.println("-> Go");
			break;
		case "red":
			System.out.println("-> Stop");
			break;
		case "yellow":
			System.out.println("-> Ready");
			break;
		case "green":
			System.out.println("-> Go");
			break;
		default:
			System.out.println("Enter the right color and run the program again.");
		}
	}

}
