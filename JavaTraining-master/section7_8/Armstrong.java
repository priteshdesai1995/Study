package section7_8;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
		int ori=no;
		int rem=0,res=0;
		while(no!=0)
		{
			rem=no%10;
			res=res+(rem*rem*rem);
			no=no/10;
		}
		System.out.println(res);
		if(ori==res)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
		

	}

}
