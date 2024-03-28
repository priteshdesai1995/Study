package section7_8;

public class Radix_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="76A";
		if(num.matches("[0-1]+"))
		{
			System.out.println("Binary radix=2");
		}	
		else if(num.matches("[0-7]+"))
		{
			System.out.println("Octal radix=8");
		}
		else if(num.matches("[0-9]+"))
		{
			System.out.println("decimal radix=10");
		}
		else if(num.matches("[0-9A-F]+"))
		{
			System.out.println("hexadecimal radix=16");
		}
		
		int leap=1988;
		if(leap%4==0)
		{
			if(leap%100==0)
			{
				System.out.println("Not a Leap year");
				
				if(leap%400==0)
				{
				System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a Leap year");
				}
			}
			else
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}
	

}
