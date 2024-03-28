package section9_Array;

import java.util.Scanner;

public class Array2d_AccDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Column: ");
		int r = sc.nextInt();
		int c=sc.nextInt();
		int A[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)		
			{
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(A[i][j]);
			}
		}
	}

}
