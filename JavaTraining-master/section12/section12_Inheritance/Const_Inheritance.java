package section12_Inheritance;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle()
	{
		length=breadth=1;
	}
	
	Rectangle(int l, int b) {
		length=l;
		breadth=b;
	}
}

class cuboid extends Rectangle
{
	int height;
	cuboid()
	{
		height=10;
	}
	cuboid(int h)
	{
		height=h;
	}
	cuboid(int l,int b, int h)
	{	
		super(l,b);
		height=h;
	}
	int volume()
	{
		return length*breadth*height;
	}
}

public class Const_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cuboid c=new cuboid(5,3,20);
		System.out.println(c.volume());
	}

}
