
public class ConsonentsInString {
	
	public static void main(String[] args) {
		// to calculate consonants in the string
		
		String st = "Dnyneshufif";
		int a = st.length();
		int count = 0;
		for(int i=0; i < a ; i++) {
			char ch = st.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count = count;
			}
			else if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U') {
				count=count;
			}
			else {
		        count++;
			}
		}
		System.out.println("Number of consonants in the string is: "+count);
	}

}
