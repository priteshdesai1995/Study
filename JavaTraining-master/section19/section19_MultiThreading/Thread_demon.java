package section19_MultiThreading;
//Deamon  join

public class Thread_demon extends Thread {
	
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(" Thread "+ count++);
		}
	}
	
	public static void main(String[] args) throws Exception {
			
		Thread_demon T = new Thread_demon();
		T.setDaemon(true);
		T.start();
		
		Thread mainThread = Thread.currentThread();	//gives reference of main thread
		mainThread.join();
		
		//try{Thread.sleep(1000);}
		//catch(Exception e) {};
	}

}
