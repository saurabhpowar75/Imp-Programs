package Program;

public class String_Palindrome {

	public static void main(String[] args) {
		String s="refer";
		String a=s;
		String s1="";
		
		for (int i =s.length()-1; i >=0; i--) {
			s1=s1+s.charAt(i);
		}
		
		System.out.println(s1);
		
		if (s1.equals(a)) {
			System.out.println("The above String is a Palindrome");
		} else {
            System.out.println("The above String isn't a Palindrome");
		}
		

	}
}
