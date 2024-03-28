package section6;

public class FormatedOutouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float f=123.123f;
			System.out.printf("%6.2f",f);
			
			String str="Java";
			System.out.println();
			System.out.printf("%20s",str); // string will be shifted to right.
			System.out.println();
			System.out.printf("%-20s",str); // string will be shifted to left.
			
			int x=10;
			char c='A';
			System.out.println();
			System.out.printf("%5d %2c",x,c);
			System.out.println();
			System.out.printf("%+5d",x);
			System.out.println();
			System.out.printf("%-5d",x);
			System.out.println();
			System.out.printf("%05d",x);
			System.out.println();
			System.out.printf("%5d",x);

	}

}
