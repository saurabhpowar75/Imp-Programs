package Program;

public class Builder_and_Buffer {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Viraj");
		for (int i = 0; i <100000000; i++) {
			sb.append(" Jadhav");
		}
		System.out.println("The Total Time taken by 'sb' "+(System.currentTimeMillis()-starttime)+" milliseconds");
		
		long starttime1 = System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Viraj");
		for (int i = 0; i <100000000; i++) {
			sb1.append(" Jadhav");
		}
		System.out.println("The Total Time taken by 'sb1' "+(System.currentTimeMillis()-starttime1)+" milliseconds");
		
	}
	     
	  
	}

