package section12_Inheritance;


class rectangle {
	double len, bre;

	public void area() {
		double area = len * bre;
		System.out.println("Area: " + area);
	}

	public double perimeter() {
		return 2 * (len + bre);
	}

}

class Circle extends rectangle
{
	double radius=15.5;
	public void area1()
	{
	double area=Math.PI*radius*radius;
	System.out.println("Area: "+area);
	}
}
public class Inheritance_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		circle.bre=10;
		circle.len=20;
		circle.area();
		circle.area1();
		System.out.println(circle.perimeter());
	}

}
