package Program;


//WAP to Concatenate Multiple Strings
public class String_Concat {

	public static void main(String[] args) {
		String s1="Hey";
		String s2="baby";
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		//2
		System.out.println(s1+s2);
		
		//3
		StringBuffer sb=new StringBuffer();
		StringBuffer s4 = sb.append(s1).append(s2);
		System.out.println(s4);
		
		//4
		StringBuilder sd=new StringBuilder();
		 StringBuilder s5 = sd.append(s1).append(s2);
		System.out.println(s5);
		
		//5
		String s6 = String.join("",s1, s2);
		System.out.println(s6);
	}
}
