package section5;

import java.util.*;
public class Cal_areaof_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height :");
		float h=sc.nextFloat();
		float b=sc.nextFloat();
		float a=0.5f*b*h;
		System.out.println("area "+a);
		
		System.out.println("Enter a,b,c :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		float s=(x+y+z)/2f;
		double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
		System.out.println(area);
		sc.close();
	}

}
