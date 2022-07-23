package Program;

public class pass_by_reference {
public static void main(String[] args) {

	Aunty a=new Aunty();
	Dina.needjob(a);
}
	
	


}

class Aunty{
	
	void testingjob()
	{
		System.out.println("job");
	}
}

class Dina
{
	static void needjob(Aunty y)
	{
		y.testingjob();
	}
}
