package section6;

public class ch55_StringMeth1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Swapnil@gmail.com";
		System.out.println(str.indexOf("."));
		String user=str.substring(0,7);
		System.out.println("Username "+user);
		String Domain=str.substring(8,13);
		if(Domain.equalsIgnoreCase("gmail"))
		{
			System.out.println("Its a match "+Domain);
		}
		int i=str.indexOf("@");
		System.out.println("Domain Name:"+str.substring(i+1,str.length()));
			

	}

}
