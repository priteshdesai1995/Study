package section7_8;

public class palindrome_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=141;
		int ori_no=no;
		int rem=0,res=0;
		while(no!=0)
		{
			rem=no%10;
			res=(res*10)+rem;
			no=no/10;
		}
		if(ori_no==res)
		{
			System.out.println("Palindrom no "+ori_no);
		}
		else
		{
			System.out.println("Not a palindrom no "+ori_no);
		}

	}

}
