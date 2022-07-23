package Program;

//WAP to print the Maximum difference between adjacent indexes in an array
public class AdjacentArray {

	public static void main(String[] args) {
		
		int[] a= {1,4,8,15,17};
		int diff=0;
		
		for (int i = 0; i <a.length-1; i++) {
		
			if(a[i+1] - a[i]>diff)
			{
				diff=a[i+1] - a[i];
			}
			
		}
		System.out.println("The maximum Difference Between 2 Adjacent Indexes in the abov array is "+diff);
	}
}
