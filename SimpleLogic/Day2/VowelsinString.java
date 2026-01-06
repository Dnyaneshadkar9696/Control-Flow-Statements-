
public class VowelsinString {
	
	// program to calculate number of Vowels in the string
	public static void main(String[] args) {
		
	
	
	String st = "AEyanesh";
    // we can access the index of the string using the string length
	int a = st.length();
	int count = 0;
//	System.out.println(a);
	for(int i = 0; i < a ; i++) {
		// storing the value of ith index
		char ch = st.charAt(i); // this gives and goes from 0th index to the last 8th index
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			count++;
		}
		else if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U') {
			count++;
		}
		else {
	        count = count;
		}
	}
    System.out.println("The number of vowels in string is: "+ count);
	
	}
    

}
