package section12_Inheritance;

class Super
{
	void display()
	{
		System.out.println("Super class");
	}
	
}
class sub extends Super
{
	//@Override
	void display()
	{
		System.out.println("Sub class");
	}
}


	

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super sp=new Super();
		//sp.display();
		sub ss= new sub();
		ss.display();
		
	}

}
