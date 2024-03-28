package section18_Exception_Handling;

@SuppressWarnings("serial")
class AgeException extends Exception
{
	public String toString()
	{
		return "Age should be minimum";
	}
}
@SuppressWarnings("serial")	//Suppress specific warnings for annotated part of code
class LowBalException extends Exception
{
	public String toString()
	{
		return "Low Balance cannot withdraw";
	}
}
public class Checked_Unchecked {

	//Unchecked
	static void Meth1() {
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
			
		}
	}
	//checked
	static void Meth2() {
		try {
			throw new AgeException();
		}catch(AgeException e)
		{
			System.out.println(e);
		}
		
		Meth1();
	}

	static void Meth3() throws LowBalException {
		Meth2();
		throw new LowBalException();
	}
	
//	static void meth4() throws Exception
//	{
//		throw new Exception("exe");
//	}

	public static void main(String[] args) throws LowBalException {
		// TODO Auto-generated method stub
		Meth3();
	}

}
