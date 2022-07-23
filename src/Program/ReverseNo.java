package Program;

//WAP to print reversing a no
public class ReverseNo {

	public static void main(String[] args) {
		int a=3685;
		int rev=0;
		
		while(a!=0)
		{
			int rem = a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		System.out.println("The above no reversed is "+rev);
	}
}
