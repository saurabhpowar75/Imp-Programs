package Program;

public class Fibonacci {

	public static void main(String[] args) {
		int Fib1=0;
		int Fib2=1;
		int Fib3=0;
		System.out.print(Fib1+" "+Fib2);
		for (int i = 1; i < 9; i++) {
			Fib3=Fib1+Fib2;
			System.out.print(" "+Fib3);
			Fib1=Fib2;
			Fib2=Fib3;
		}
	}
}
