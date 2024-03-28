package section10_Methods;

public class Variable_Arguments {

	static int  swap(int ...x) //Can take multiple no of args
	{
		//Maximum no
		if(x.length==0) { 
			return Integer.MIN_VALUE;
		}
		int max=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max) 
				max=x[i];
		}	
			return max;
	}
	
	static void sum(int ...x)
	{
		int cal=0;
		for(int i=0;i<x.length;i++)
		{
			cal=cal+x[i];
		}
		System.out.println("Sum " + cal);
	}
	
	static void dispName(int start, String ...str)
	{
		for(int i=0;i<str.length;i++)
		{
			System.out.println(start +" Name: " +str[i]);
			start++;
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(swap(10));
		System.out.println(swap(10,20,90));
		System.out.println(swap(58));
		System.out.println(swap(new int[]{10,20,30,40})); // Array can also be passed.
		dispName(1,"Swap","Sahil");
		dispName(5,new String[] {"Sushil","sanat"});
		sum(1,2,3,4,5);
		
	}

}
