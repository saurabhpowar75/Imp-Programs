package Program;

public class Prime_no {

	public static void main(String[] args) {
		int no=37;
		boolean flag=true;
		for (int i = 2; i < no; i++) {
			if(no%i==0)
			{
				flag=false;
				break;
			}
			
		}
		
		if (flag==true) {
			System.out.println(no+" is a Prime no");
			
		} else {
			System.out.println(no+" is not a Prime no");
		}
	}
}
