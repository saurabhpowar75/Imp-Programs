package Program;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//WAP to reverse an array
public class Array_Reverse {

	public static void main(String[] args) {
		//1
		Integer [] a= {32,57,32,5,74,4};
		System.out.println("Reverse order of array is ");
		for (int i = a.length-1; i >=0 ; i--) {
			
			System.out.println(a[i]);
		}
		
		//2

		List<Integer> b = Arrays.asList(a);
		Collections.reverse(b);
		System.out.println(b);
	    
	    
	    
	}
}
