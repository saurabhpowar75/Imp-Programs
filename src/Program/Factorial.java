package Program;

public class Factorial {

	public static void main(String[] args) {
		long no=32;
		long fact=1;
		for(long i=no; i>0; i-- )
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}
