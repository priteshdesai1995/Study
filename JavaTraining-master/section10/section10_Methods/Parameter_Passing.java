package section10_Methods;

public class Parameter_Passing {
	 static void arr_pass(int A[])
	 {
		 A[0]=6;
	 }
	 
	 static String userName(String email)
	 {
		 int a = email.indexOf("@");
		 String un=email.substring(0, a);
		// System.out.println(un);
		return un;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array as parameter
		int A[]= {1,2,3,4};
		arr_pass(A);
		System.out.println(A[1]);
		
		System.out.println(userName("swapnil@gmail.com"));

	}

}
