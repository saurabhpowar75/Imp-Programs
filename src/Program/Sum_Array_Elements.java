package Program;

//WAP to Print the sum of the Elements in an Array
public class Sum_Array_Elements {

	public static void main(String[] args) {
		
		Integer [] a= {23,35,5,63,3};
		int sum = sumArray(a);
		System.out.println("The Sum of the given array elements is "+sum);
	}
	
	public static int sumArray(Integer []a)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}	
		return sum;
		
	}
}
