package Program;

//Program to sort An array into Ascending / Descending Order
//Same as Merge sort
public class Bubble_Sort {

	public static void main(String[] args) {
		
		int [] ar= {327,65,6,2,34};
		
		for (int i = 1; i < ar.length; i++) {
			for (int j = 1; j < ar.length; j++) {
				if(ar[j-1]>ar[j])
				{
					int temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		System.out.println("The above array is sorted in the ascending Order");
		System.out.println("\n");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}
}
