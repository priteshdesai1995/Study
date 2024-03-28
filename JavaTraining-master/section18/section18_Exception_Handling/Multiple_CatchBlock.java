package section18_Exception_Handling;

public class Multiple_CatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int A[]= {1,0,2,3,4};
			
			int res= A[0]/A[3];	//if exception occurs it will end here.
			System.out.println("Result"+res);
			int a=A[5];
			System.out.println(a);
		
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Divide by zero"+e);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End");
	}

}
