package Program;

//WAP to remove the characters in a string  'o'
public class Remove_String_characters {

	public static void main(String[] args) {
		String s="Hola Senorita";
		String s1="";
		

		for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)!='o')
				{
					s1=s1+s.charAt(i);
				}
		}
		
		System.out.println(s1);
	}
	

	
	
}
