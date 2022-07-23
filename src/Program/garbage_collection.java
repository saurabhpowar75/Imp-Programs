package Program;

public class garbage_collection {

	
	int a=12;
	
	void sim()
	{
		System.out.println("Goat");
	}
	
	protected void finalize()
	{
		Object g1 = null;
		System.out.println("Do garbage Collection");
	}
	
	public static void main(String[] args) {
		garbage_collection g1=new garbage_collection();
		System.out.println(g1);
		g1.sim();
		System.out.println(g1.a);
		
		garbage_collection g2=new garbage_collection();
		
		g1=null;
		System.out.println(g1);
		
		System.gc();
		
		
	}
}
