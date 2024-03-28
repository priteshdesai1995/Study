package section7_8;

import java.util.*;
public class day_Mon_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print week day as per number
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter day number: ");
		int day=scanner.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;
		}
		
		//Print month as per number
		
		System.out.println("Enter Month number: ");
		int month=scanner.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("January");
			break;
			
		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("July");
			break;
			
		case 8:
			System.out.println("August");
			break;

		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;

		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;
		}
		
		// Display type of website
		System.out.println("Enter the string: ");
		String url=scanner.next();
		String dom=url.substring(url.lastIndexOf(".")+1,url.length());
		System.out.println(dom);
	
		switch(dom)
		{
		case "com":
			System.out.println("Commercial");
			break;

		case "org":
			System.out.println("Organization");
			break;

		case "gov":
			System.out.println("Government");
			break;
			
			default:
				System.out.println("Invalid extension");
				break;
		}
		
		
	}
}
