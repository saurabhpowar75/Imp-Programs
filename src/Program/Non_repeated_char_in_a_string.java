package Program;

//Find first Non-Repeated character in a String

public class Non_repeated_char_in_a_string {
	public static void main(String args[]) {
	     
         String s="teeter";
         for(char i:s.toCharArray())
         {
        	 if(s.indexOf(i)==s.lastIndexOf(i))
        	 {
        		 System.out.println("The First non repeated character in a string "+i);
        		 break;
        	 }
         }
         
	        //indexOf() : returns the position of First occurrence of a character in a given string
	        //lastIndexOf() : returns the position of last occurrence of a character in a given string 


	
}
}