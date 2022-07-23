package Program;

//WAP to find the Maximum value in an array

public class Array_max {

	public static void main(String[] args) {
		
		int [] ar= {2,46,7,345,67};
		int max=0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>=max)
			{
				max=ar[i];
			}
		}
		System.out.println("The largest no in the array is "+max);
	}
}
