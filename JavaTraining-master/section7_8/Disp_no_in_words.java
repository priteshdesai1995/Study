package section7_8;

public class Disp_no_in_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=188;
		String str="";
		int rem=0;
		char c ;
		
		while(n!=0) {
		rem=n%10;
		str=str+rem;
		n=n/10;
		}
		System.out.println(str);
		for(int i=str.length();i>0;i--)
		{
			c=str.charAt(i-1);
			 switch(c)
	            {
	                case '0':System.out.print("Zero ");
	                        break;
	                case '1':System.out.print("One ");
	                        break;
	                case '2':System.out.print("Two ");
	                        break;
	                case '3':System.out.print("Three ");
	                        break;
	                case '4':System.out.print("Four ");
	                        break;
	                case '5':System.out.print("Five ");
	                        break;
	                case '6':System.out.print("Six ");
	                        break;
	                case '7':System.out.print("Seven ");
	                        break;
	                case '8':System.out.print("Eight ");
	                        break;
	                case '9':System.out.print("Nine ");
	                        break;
	                       
	            }		}
	}

}
