package Program;

//WAP to count the Total no of vowels in a String
public class Vowels_Count {

	public static void main(String[] args) {
		String s="dgvbltdkp;jfletbsd,lmg;shankcg spodjkglauf";
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||
					s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println("The Count of vowels in the Given String is "+count);
	}
}
