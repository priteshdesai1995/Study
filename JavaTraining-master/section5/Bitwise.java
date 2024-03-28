package section5;

public class Bitwise {

	public static void main(String[] args) {
		
		int a=10,b=15;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a"+a+"b"+b);
		
		int x=10,y=20;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
		int z=0b1000;
		int z1=x>>1; //x~
		int z2=x<<1;
		System.out.println("Left Shift " +  z1);
		System.out.println("Right Shift " + z2);
		
		int p=-0b100;
		int q;
        q=p>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(p)));
        System.out.println(String.format("%s",Integer.toBinaryString(q)));

	}

}	
