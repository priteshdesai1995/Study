package section9_Array;

import java.util.Scanner;

public class Adding_2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row and Column: ");
		int r = sc.nextInt();
		int c=sc.nextInt();
		int A[][]=new int[r][c];
		int B[][]=new int[r][c];
		int C[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)		
			{
				A[i][j]=sc.nextInt();
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(C[i][j]);
			}
		}
		
		
		
	}

}
