package section12_Inheritance;


class Parent
{
	public void Display() {
		System.out.println("--Parent--");
	}
}

class Child extends Parent
{
	@Override
	public void Display() {
		System.out.println("--Child--");
	}
}
public class DynamicMeth_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent Pc = new Child();		//Dynamic Method Dispatch (Reference is of parent and object is of base class
		Pc.Display();

	}

}
