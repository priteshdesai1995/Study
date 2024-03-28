package section18_Exception_Handling;

public class Finally_Block {
	
	static void mains()
	
	{
		try {
			System.out.println("bacd");
		}
		finally
		{
			System.out.println("Finally");
		}
	}
	public static void main(String args[])
	{
		mains();
		try {
			int a=10/0;
			System.out.println("value"+a);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
		finally
		{
			System.out.println("the end");
		}
	}

}
