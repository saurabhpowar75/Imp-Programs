package Program;

public class Primeno_1_100 {
public static void main(String[] args) {
	for (int i = 1; i <=100; i++) {
		boolean flag=true;
		for (int j = 2; j <i; j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("The Prime nos are "+i);
		}
		
	}
}
}
