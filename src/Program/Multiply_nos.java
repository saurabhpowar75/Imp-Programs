package Program;

//WAP to Multiply 2 Nos without using the Multiplication Operator
public class Multiply_nos {

	public static void main(String[] args) {
		int mul=multiply(4,7);
		System.out.println("The Multiplication of the above 2 nos without * Operator is "+mul);
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int sum=0;
		int k=1;
		while(k<=j)
		{
			sum=sum+i;
			k++;
		}
		return sum;
	}
}
