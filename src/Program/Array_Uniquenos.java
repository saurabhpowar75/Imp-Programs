package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

//Print all the Unique Nos in an array
public class Array_Uniquenos {

	public static void main(String[] args) {
		
		//Method 1
		int[]a= {4,5,5,5,4,6,6,9,4};
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			t.add(a[i]);
		}
		
	
		for(Integer q:t)
		{
			System.out.println(q);
		}
		
	}
	
}
