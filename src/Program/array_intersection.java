package Program;
 
//WAP to Print the Intersecting elements between 2 arrays
public class array_intersection{
	public static void main(String[] args) {
		int[] a= {36,23,4,64,3};
		int[] b= {32,5,4,64,7,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
			
		}
	}
}