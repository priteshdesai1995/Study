package section9_Array;

public class Incre_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6};
		int b[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		a=b;
		for(int i=0;i<5;i++)
		{
			System.out.println("Array B: "+b[i]);
		}
		System.out.println(a.length);
		System.out.println(b.length);

	}

}
