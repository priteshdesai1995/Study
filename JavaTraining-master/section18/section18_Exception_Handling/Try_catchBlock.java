package section18_Exception_Handling;
import java.util.*;
public class Try_catchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Numerator: ");
			int num=sc.nextInt();
			System.out.println("Enter Denominator: ");
			int deno=sc.nextInt();
			int z=num/deno;
		
		System.out.println("Result"+z); //Line will not print due to exception occurs.
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be Zero"+e+"change to !0");
		}
		
	//	System.out.println("Working...");
		finally	// Executes whether try catch fails
		{
		System.out.println("Finally Block");	
		}



	}

}
