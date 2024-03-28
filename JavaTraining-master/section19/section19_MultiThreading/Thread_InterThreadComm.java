package section19_MultiThreading;

class mydata{
	int value=0;
	boolean flag=true;

	synchronized public void set(int v){
		while(flag!=true)
            try {
            	wait();
            	}
		catch(Exception e){}
        
        value=v;
        flag=false;
        notify();
	}
	 synchronized public int get()
	    {
	        int x=0;
	        while(flag!=false)
	            try {
	            	wait();
	            	}
	        catch(Exception e){}
	        
	        
	        x=value;
	        flag=true;
	        notify();
	        
	        return x;            
	    }
	}


class producer extends Thread
{
	mydata d;
	public producer (mydata md){
		d=md;
	}
	public void run()
	{
		int count=1;
		while(true)
		{
		d.set(count);
        System.out.println("Producer "+count);
        count++;
		}
	}
}

class consumer extends Thread
{
	mydata d;
	consumer(mydata md)
	{
		d=md;
	}
	
	public void run()
	{
		int val;
		while(true)
		{
			try {
				val=d.get();
			} catch (Exception e) {
		}
			System.out.println("Consumer "+d);
		}
	}
}

public class Thread_InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mydata md = new mydata();
		producer p =new producer(md);
		consumer c = new consumer(md);
		p.start();
		c.start();
	}

}
