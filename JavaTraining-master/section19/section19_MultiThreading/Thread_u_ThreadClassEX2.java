package section19_MultiThreading;

public class Thread_u_ThreadClassEX2 extends Thread{

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
		Thread_u_ThreadClassEX2 T2 = new Thread_u_ThreadClassEX2();
		T2.start();
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}

}
