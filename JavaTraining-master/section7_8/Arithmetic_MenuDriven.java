package section7_8;

import java.util.Scanner;

public class Arithmetic_MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1. Add.\n 2. Sub.\n 3. Mul.\n 4. Div.");
		System.out.println("Enter Your Choice: ");
		Scanner  sc = new Scanner(System.in);
		String ch=sc.next();
		System.out.println("Enter a and b; ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
		case "Add":
			System.out.println("Addition: "+ (a+b));
			break;
		case "Sub":
			System.out.println("Subtraction: "+ (a-b));
			break;
		case "Mul":
			System.out.println("Multiplication: "+ (a*b));
			break;
		case "Div":
			System.out.println("Division: "+ (a/b));
			break;
			
		}
		

	}

}
