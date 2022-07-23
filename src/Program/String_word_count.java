package Program;

//Count the no of words in a String
public class String_word_count {

	public static void main(String[] args) {
		String s1="Hi this is Viraj";
		int count=1;
		
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("The no of words in the given String are "+count);
		
	}
}
