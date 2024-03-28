package section6;

public class Methods_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[]= {'a','b','c','d'};
		String strc=new String(c);
		System.out.println(strc);
		
		byte b[]= {10,20,30,40};
		String strb=new String(b);
		System.out.println(strb);

		
		//Methods of string
		String str="Swapnil";
		String str1="Swapnil";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.substring(2));
		System.out.println(str.substring(0, 3));
		System.out.println(str.replace('l', 'v'));
		System.out.println(str.startsWith("S"));
		System.out.println(str.endsWith("l"));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("p"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(String.valueOf(5));
	}

}
