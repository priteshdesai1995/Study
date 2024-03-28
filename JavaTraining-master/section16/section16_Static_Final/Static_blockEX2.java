package section16_Static_Final;
// In another class
//class is not loaded so static block will not execute
class test
{
	static 
	{
		System.out.println("Block1");
	}
	
	static
	{
		System.out.println("Block2");
	}
}

public class Static_blockEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
//		test t = new test(); //class is loaded here static blocks will execute.
	}

}
