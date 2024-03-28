package section10_Methods;

public class Recursion_ex {
	void fun(int x)
	{
		if(x>0)
		{
			System.out.println(x);
			fun(x-1);
		}
	}
	
	void fun2(int x)
	{
		if(x>0)
		{
			fun(x-1);
			System.out.println(x);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion_ex regx=new Recursion_ex();
		regx.fun(3);
		regx.fun2(3);

	}

}
