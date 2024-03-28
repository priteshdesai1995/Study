package section9_Array;

import java.util.Scanner;

public class Searching_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to Search: ");
		int search=sc.nextInt();
		int A[]= {1,2,3,4,5};
		for(int i=0;i<A.length;i++)
		{
			if(search==A[i])
			{
				System.out.println("Element Found at index "+i);
				System.exit(0);
			}
			else
			{
				System.out.println("Element not found");
			}
			
		}
	}

}
