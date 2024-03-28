package section9_Array;

public class Max_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,20,4,5};
		int max=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(max<A[i])
			{
				max=A[i];
			}
		}
		System.out.println("Maximun Element"+max);
	}

}
