package Program;

//WAP to check whether the below 2 Strings are Anagrams
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Now";
		String s2="Own";
		boolean result=true;
		
		//Remove all the Whitespaces and convert to Lower case
		s1=s1.replaceAll("\\s", "").toLowerCase(); // \\s - matches single whitespace character.
		s2=s2.replaceAll("\\s", "").toLowerCase();
	
		//Check length of both string values
		if(s1.length()!=s2.length())
		{
			result=false;
		}
	
		//Convert both Strings into arrays
		char[] Array1 = s1.toCharArray();
		char[] Array2 = s2.toCharArray();
		
		//Sort both the arrays
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		//Now Compare both Strings to check whether they're anagrams
		System.out.println(Arrays.equals(Array1, Array2));
	}
}
