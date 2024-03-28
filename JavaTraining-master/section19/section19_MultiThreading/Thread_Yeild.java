package section19_MultiThreading;

public class Thread_Yeild extends Thread{

	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(" Thread "+ count++);
		}
	}

	public static void main(String args[])
	{
		Thread_Yeild T = new Thread_Yeild();
		T.start();
	
		int count=1;
		while(true)
		{
			System.out.println(" Thread main"+ count++);
			Thread.yield();		
			/*Thread class and it can stop the currently executing 
			thread and will give a chance to other waiting threads of the same priority
			*/
			}
		
	}
}

