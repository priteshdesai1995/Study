package section16_Static_Final;

class single
{
	static single ss = new single();
	private single()
	{
		System.out.println(" It will invoke only one object");
	}
	
	public static single getIns()
	{
		return ss;
	}
}


public class Singleton_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single s = new single(); constructer is not accessable due to private access specifier
		single S = single.getIns();
		single S1 = single.getIns();		//Both refers to single object 	

		System.out.println(S);
		System.out.println(S1);
		
	}
}	
	