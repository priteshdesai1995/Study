package section1_LambdaExp;

import javax.xml.stream.events.StartDocument;

public class Thread_with_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = () -> {	
			for(int i=0;i<10;i++)
			{
				System.out.println("Lambda Child Thread");
			}
		};
		Thread T = new Thread (r);
		T.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Lambda Main Thread");
		}
	}

}
