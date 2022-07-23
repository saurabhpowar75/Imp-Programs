package Program;

//WAP to find Maximum value in an array using collection
public class Max_Value_in_Array {

	public static void main(String[] args) {
		
		//1st method
		int [] ar= {23,24,584,1,34};
		int max=0;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>ar[max])
			{
				max=i;
			}
		}
		System.out.println("The Maximum value in the given array is "+ar[max]);
	

	}
}
