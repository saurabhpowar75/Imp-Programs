package Program;

import java.util.Scanner;

public class Square_root {

	static double square(int n)
	{
		double t;
		
		double squareroot=n/2;
		
		do {
			t=squareroot;
			
			squareroot=(t+(n/t))/2;
		}while((t-squareroot)!=0);
		
			
		return squareroot;	
	}
	
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a = sc.nextInt();
	double root = square(a);
	System.out.println("The square root of the Number "+a+" is "+root);
}
}
