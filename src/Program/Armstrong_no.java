package Program;

//WAP to check whether a No is Armstrong no or not

public class Armstrong_no {

	public static void main(String[] args) {
		int a=371;
		int b=a;
		int sum=0;
		while(a!=0) {
			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		
		
		if(b==sum) {
			System.out.println("The above no is an Armstrong no");
		}
		
		else {
			System.out.println("The no's not an armstrong no");
		}
	}
}
