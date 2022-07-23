package Program;

public class pass_by_value {

	
	static void add(int y)
	{
		System.out.println(y+y);
	}
	
	public static void main(String[] args) {
		int x=30;
		add(x);
	}
}
