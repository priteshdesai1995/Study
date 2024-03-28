package section10_Methods;

public class Method_overloading_1 {

	static void reverse(int x)
	{
		int rem=0;
		int rev=0;
	while(x!=0)
	{
		rem=x%10;
		rev=(rev*10)+rem;
		x=x/10;
	}
	System.out.println(rev);
	}
	
	static int[] reverse(int a[])
	{
		int b[]=new int[a.length];
		for(int i=a.length-1,j=0;i>0;i--,j++)
		{
			b[j]=a[i];
		}
		for(int x:b)
		{
			System.out.println(x);
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(123);
		int a[]= {1,2,3};
		reverse(a);
	}

}
