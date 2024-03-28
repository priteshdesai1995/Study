package section19_MultiThreading;

class Test implements Runnable{
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

public class Thread_u_RunableIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test T = new Test();
		Thread T1 = new Thread(T);
		T1.start();
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}

}
