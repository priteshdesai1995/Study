package section19_MultiThreading;

class X implements Runnable
{
public void run()
{
 System.out.println("Thread X started");
 for(int i = 1; i<=4; i++)
 {
   System.out.println("Thread X: " +i);	  
 }
System.out.println("Exit from X");
 }
}
class Y implements Runnable
{
public void run()
{
 System.out.println("Thread Y started");	
 for(int j = 0; j <= 4; j++)
 {
  System.out.println("Thread Y: " +j);	 
 }
 System.out.println("Exit from Y");
}
}
 class Z implements Runnable
{
public void run()
{
 System.out.println("Thread Z started");	
 for(int k = 0; k <= 4; k++)
 {
  System.out.println("Thread Z: " +k);	 
 }
 System.out.println("Exit from Z");
 }
}
public class Thread_Priority_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 X x = new X();
		 Y y = new Y();
		 Z z = new Z();
		 
		Thread t1 = new Thread(x);
		Thread t2 = new Thread(y);
		Thread t3 = new Thread(z);

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority() + 4);
		t3.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
