package section19_MultiThreading;

class MyThread extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}
}
public class Thread_u_ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread T = new MyThread();
		T.start();
		int i=1;
		while(true)
		{
			System.out.println(i+"Swapnil");
			i++;
		}
	}

}
