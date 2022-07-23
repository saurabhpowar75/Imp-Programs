package Program;
//WAP to convert Uppercase String to Lower case and Vice Versa

/*Logic is that we check the unicode of the character , if the unicode lies between  97 to 122 then subtract 32 from that so that it will automatically 
 *be converted from lowercase to uppercase unicode integer representation of character while if the unicode lies between 65 to 90 then add 32 from that
  number so that it will automatically be converted from uppercase to lowercase unicode integer representation of character .
*/
public class Upper_to_lower {

	static void casechange(String s)
	{
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>64 && ch<91) {  //Unicode of UpperCase Characters
				ch=(char) (ch+32); //Class or Derived Typecasting
				System.out.print(ch);
				
			} else if(ch>96 && ch<123) //Unicode of Lowercase Characters
			{
               ch=(char) (ch-32);
               System.out.print(ch);
			}
			
			else
			{
				ch=32;  //ascii value or the unicode value of space is 32
				System.out.print(" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("The Original String is");
		System.out.println("Help one Another");
		System.out.println("\n");
		System.out.println("After case conversion");
		Upper_to_lower.casechange("Help one Another");
	}
}
