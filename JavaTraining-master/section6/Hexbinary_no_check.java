package section6;

public class Hexbinary_no_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=1010101;
		String hex="123af";
		String str=String.valueOf(b);
		String s=Integer.toString(b);
		System.out.println(str.matches("[01]*"));
		System.out.println(hex.matches("[[0-9][a-z][A-Z]]+"));
	}

}
