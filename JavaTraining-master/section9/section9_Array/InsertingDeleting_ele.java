package section9_Array;

import java.util.Scanner;

public class InsertingDeleting_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		int n=6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value and index: ");
		int val=sc.nextInt();
		int index=sc.nextInt();
		
		for(int i=n;i>index;i--)
		{
			a[i]=a[i-1];
			a[index]=val;
		}
		for(int x=0;x<n;x++)
		{
			System.out.print(a[x]);
		}
		System.out.println("Element Inserted");
		
		//Deleting element
		
		System.out.println("Enter element: ");
		int k=sc.nextInt();
		int temp=a[k];
		for(int j=k;j<n-1;j++)
		{
			a[j]=a[j+1];
			
		}
		n=n-1;
		for(int x=0;x<n;x++)
		{
			System.out.print(a[x]);
		}
		System.out.println("Element deleted");
	}

}
