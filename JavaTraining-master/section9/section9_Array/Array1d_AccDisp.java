package section9_Array;

import java.util.Scanner;

public class Array1d_AccDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Accept
		int A[] = new int[10];
		for(int i=0;i<10;i++)
		{
			A[i]=sc.nextInt();
		}
		//Display
		for(int D:A)
		{
			System.out.print(D);
		}
		
		

	}

}
