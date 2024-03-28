package section10_Methods;

public class Method_Overloading {

	static void area(int h, int b)
	{
		int area=h*b;
		System.out.println(area);
	}
	static void area(int s)
	{
		int area=(int) Math.sqrt(s);
		System.out.println(area);
	}
	static void area(float x, float y, float z)
	{
		float area=x*y*z;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area(2,3);
		area(4);
		area(5.0f,3.1f,2.7f);
	}

}
