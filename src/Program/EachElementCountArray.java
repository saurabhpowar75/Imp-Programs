package Program;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EachElementCountArray {

	static Integer x;
	public static void main(String[] args) {
		int [] a= {4,5,5,5,4,6,6,9,4};
		
		Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!m.containsKey(a[i])) {
				m.put(a[i], 1);
				
			}
			else {
			    x = m.get(a[i]);
				x++;
				m.put(a[i], x);
			}
			
		}
		
		
		System.out.println(m.entrySet());
		System.out.println(m.keySet()); //Printing unique elements in an array using Hashmap
		
		
	}
}
