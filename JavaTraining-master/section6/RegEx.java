package section6;
import java.util.*;
public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="Swap";
		System.out.println(str.matches("[a-z A-Z]*"));
		System.out.println("Enter email ");
		String email=sc.next();
		if(email.matches(".*gmail.*"))
		{
			{
				System.out.println("valid");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
		
		//[A-Z a-z 0-9]+[(_)]+[(@)]+[a-z]+[.]+[2-3]+ 
		//if(email.matches("\\w*@gmail(.*)"))
		
		//if(email.matches(".*gmail.*"))
	
	
}
}