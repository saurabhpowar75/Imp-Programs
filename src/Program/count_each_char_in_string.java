package Program;

import java.util.HashMap;

//WAP to count the Occurrence of a character in a String 
public class count_each_char_in_string {

	public static void main(String[] args) {
		
		String s="Visca El Barca";
		s.toLowerCase();
		char[] s1 = s.toCharArray();
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		for(char c:s1)   
		{
			if(h.containsKey(c))
			{    
				h.put(c, h.get(c)+1);
			}
			
			else {
				h.put(c, 1);
			}
		}
		System.out.println("The individual count for each character in a string is as follows \n"+h);
	}
}
