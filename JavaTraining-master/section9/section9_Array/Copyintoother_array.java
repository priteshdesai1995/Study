package section9_Array;

import java.util.Scanner;

public class Copyintoother_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Array a: 	"+a[i]);
		}
		
		System.out.println("After copying ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Array B: "+b[i]);
		}
	}

}
