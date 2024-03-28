package section13_AbstractClass;

abstract class Super
{
	Super()
	{
	System.out.println("Super class constructer");	
	}
	
	abstract void superMeth();
	
}

class Sub extends Super
{

	@Override
	void superMeth() {
		// TODO Auto-generated method stub
		System.out.println("Overrided method "); // Overrided method of Super class which is abstract
	}
	
}

public class Abstract_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super su = new Sub();
		su.superMeth();
	}

}
