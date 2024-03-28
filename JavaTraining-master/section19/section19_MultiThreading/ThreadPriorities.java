package section19_MultiThreading;

class ThreadPriority implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current thread");
		
	}
	
}

public class ThreadPriorities extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread T1 = new Thread();
		ThreadPriority  threadpriority = new ThreadPriority();
		Thread T2 = new Thread(threadpriority,"Thread T2");
		T2.setPriority(MAX_PRIORITY);
		T1.setPriority(MIN_PRIORITY);
		T1.setName("this is thread t1");
		System.out.println("Priority of thread: "+T1.getPriority());
		System.out.println("Thread name: "+T1.getName());
		System.out.println("Thread Id: "+T1.getId());
		System.out.println("Priority of thread: "+T2.getPriority());
		System.out.println("Thread name: "+T2.getName());
		System.out.println("Thread Id: "+T2.getId());

		T2.start();
		T1.start();

	}

}
