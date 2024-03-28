package section19_MultiThreading;

public class Thread_u_RunnableIFEX2 implements Runnable{

	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_u_ThreadClassEX2 TR = new Thread_u_ThreadClassEX2();
		Thread T = new Thread(TR);
		T.start();
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}

}
