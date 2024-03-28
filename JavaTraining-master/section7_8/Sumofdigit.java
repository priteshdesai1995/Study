package section7_8;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=145;
		int rem=0,res=0;
		while(no!=0)
		{
			rem=no%10;
			res=res+rem;
			no=no/10;
		}
		System.out.println("Sum is "+res);


	}

}
