package section10_Methods;

public class Evenodd {
	void evenOdd(int x)
	{
		if(x%2==0)
		{
			System.out.println("Even " +x);
		}
		else
		{
			System.out.println("odd "+x);
		}
	}
	
	boolean isPrime(int x)
	{
		for(int i=0;i<=x/2;i++)
		{
			if(x%2==0)
				return true;
		}
		return false	;
		
	}
	
	int gcd(int m, int n)
	{
		while(m!=n)
		{
		if(m>n)
		m=m-n;
		else
		 n=n-m;
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=5;
		 
		 Evenodd ev=new Evenodd();
		 ev.evenOdd(x);		
		 System.out.println(ev.isPrime(91));
		 System.out.println(ev.gcd(35, 56	));
		 
		
	}

}
