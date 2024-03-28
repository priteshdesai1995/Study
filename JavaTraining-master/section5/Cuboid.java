package section5;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
				int len,bre,hei;
				int totArea,vol;
				System.out.println("Enter lenth,Breadth,Height :");
				len=sc.nextInt();
				bre=sc.nextInt();
				hei=sc.nextInt();
				
				totArea=2*(len*bre+len*hei+bre*hei);
				vol=len*bre*hei;
				
				System.out.println("Area "+totArea+"volume "+vol);
			

	}

}
