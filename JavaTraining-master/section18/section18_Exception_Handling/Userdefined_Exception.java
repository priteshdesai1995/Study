package section18_Exception_Handling;

class UserDefinedException extends Exception{
	
	public String toString()
	{
		return "Non negative value not allowed";
	}

}

public class Userdefined_Exception {	
	static int area(int len,int bre) throws UserDefinedException
	{
		if(len<0 || bre<0)
			throw new UserDefinedException();	
	return len*bre;	
	}
	
	static void meth() throws UserDefinedException
	{
		System.out.println("Area: "+area(10,1));
	}
	
	public static void main(String[] args) throws UserDefinedException  {
		// TODO Auto-generated method stub
	try {
		meth();
	}
	catch(UserDefinedException e)
	{
		System.out.println(e);
	}
	}

}
