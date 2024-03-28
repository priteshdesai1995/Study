package section16_Static_Final;

class Demo
{
	final int MIN = 5;
	final static int MAX;
	final int NORMAL;
	
	static
	{
		MAX=10;
		System.out.println(MAX);
	}
	
	Demo()
	{
		NORMAL=7;
		System.out.println(NORMAL);
	}
	final void neth()
	{
		System.out.println("Cannot be overridded");
	}

}

final class Final
{
	//System.out.println("This class cannot be inherited");
	
}
public class Final_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		System.out.println(d.MIN);
		
	}

}
