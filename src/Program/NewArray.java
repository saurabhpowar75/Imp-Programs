package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to compare same indexes of 2 Different arrays and Create new Array For matching values
public class NewArray {

	public static void main(String[] args) {
		
		int [] a= {1,4,5,7};
		int [] b= {6,4,3,7};
		
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b[i])
			{
	          a1.add(a[i]);			
			}
		}
		
		Object[] ab = a1.toArray();
		
		for(Object ob:ab)
		{
			System.out.println(ob);
		}
	}
}
