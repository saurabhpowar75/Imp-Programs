package Program;

public class Total_String_Characters {

	public static void main(String[] args) {
		String s="Neil Patrick";
		int count=0;
		
		
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println("The Total no of characters in the string are "+count);
	}
}
