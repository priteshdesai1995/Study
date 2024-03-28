package section16_Static_Final;

class Stat_mem
{
	static  int s=10; //single copy 
			int a=30;
 
	void display()
	{
		System.out.println(s+" "+a); //Non Static method can acces both atatic and nonstatic members.
	}
	
	static void Sdisp()
	{
//		System.out.println(s+""+a+""+b); //Static  Method can only accept static members.
		System.out.println(""+s);
	}
}

public class Static_Members {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stat_mem sm = new Stat_mem();
		sm.s=50;
		sm.a=20;
		
		sm.display();
		//Stat_mem.Sdisp();
		
		Stat_mem sm1 = new Stat_mem();
		sm1.display();	 //Single copy

	}

}
