package section5;

import java.util.Scanner;

public class QuadraticEQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println(r1);	
		r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println(r2);

		


	}

}
