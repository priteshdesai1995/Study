package section19_MultiThreading;

public class ThreadSleep extends Thread{
	public void run()	//extended class of thread
	{
		int count=1;
		while(true)
		{
			System.out.println("Sleep for 10s"+count);
			count++;
			try {
				Thread.sleep(1000);	//delays thread
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep T = new ThreadSleep();
		T.start();
		T.interrupt();//Interrupts thread for single iteration
	}

}
