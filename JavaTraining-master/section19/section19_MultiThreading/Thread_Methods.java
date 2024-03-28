package section19_MultiThreading;

public class Thread_Methods extends Thread {
	public Thread_Methods(String name)
	{
		super(name);
		setPriority(Thread.MAX_PRIORITY);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread_Methods T = new Thread_Methods("swapnil");
		System.out.println(T.getId());
		System.out.println(T.getName());
		System.out.println(T.getPriority());
		T.start();

		System.out.println(T.getState());
		System.out.println(T.isAlive());
	}

}
