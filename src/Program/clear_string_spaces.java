package Program;

public class clear_string_spaces {

	public static void main(String[] args) {
		String s="Leo messi the greatest";
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch!=' ') {
				System.out.print(ch);
			}
		}
	}
}
