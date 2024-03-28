package section19_MultiThreading;

class Mydata {
	synchronized public  void Display(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			try {
			Thread.sleep(1000);}catch(Exception e) {System.out.println(e);}
		}
	}
}

class Thread1 extends Thread
{
	Mydata d;
	public Thread1(Mydata d)
	{
		this.d=d;
	}
	public void run()
	{
		d.Display("Good");
	}
}


class Thread2 extends Thread
{
	Mydata d;
	public Thread2(Mydata d)
	{
		this.d=d;
	}
	public void run()
	{
		d.Display("Morning");
	}
}


public class Thread_Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mydata mydata = new Mydata();
		Thread1 t1 = new Thread1(mydata);
		Thread2 t2 = new Thread2(mydata);
		t1.start();
		t2.start();
		
	}

}
