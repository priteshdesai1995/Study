package section9_Array;

public class SecondMax_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5};
		int max1 = A[0],max2=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(max1<A[i])
			{
				max2=max1;
				max1=A[i];
			}
			else if(max2<A[i])
			{
				max2=A[i];
			}
		}
		System.out.println("Second Largest: "+max2);
		
	}

}
