package Program;

//WAP to swap 2 nos using temp
public class Swapping {

	public static void main(String[] args) {
		int a=34;
		int b=24;
		int temp=0;
		
//	    temp=b;
//	    b=a;
//	    a=temp;
//	    
//	    System.out.println(a);
//	    System.out.println(b);
	    
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println(a);
	    System.out.println(b);
	}
}
