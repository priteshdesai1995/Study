package section9_Array;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Left Rotation
		int A[]= {1,2,3,4,5};
		int temp=A[0];
		for(int i=1;i<A.length;i++)
		{
			A[i-1]=A[i];
		}
		A[A.length-1]=temp;
		
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}

	}

}
