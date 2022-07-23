package Program;

//Count the character 'j' in the string below  
public class Character_repetition {

	public static void main(String[] args) {
		String s="jhf jsjdaf, asdasjfg";
		char[] s1 = s.toCharArray();
		int count=0;
		
		for (int i = 0; i < s1.length; i++) {
			if(s1[i]=='j')
			{
				count++;
			}
		}
		System.out.println("The count of the character 'j' in the String is "+count);
		
		
				
	}
}
