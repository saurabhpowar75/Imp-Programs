package Program;

import java.util.HashSet;

//WAP to ensure all characters in string are unique

/* flag=false : Unique characters don't exist
 * flag=true : Unique characters do exist */

public class Unique_char {

	public static void main(String[] args) {
		boolean flag=false;
		String s="Swim Love";
		System.out.println(s);
		HashSet h=new HashSet();
		for (int i = 0; i < s.length(); i++) {
			flag=h.add(s.charAt(i));
			if (flag==false) {
				break;
			}
			System.out.println(flag);
		}
	}
}
