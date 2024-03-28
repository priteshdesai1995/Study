package section13_AbstractClass;

abstract class Shape
{
	abstract double area();
	abstract double perimeter();
	
}

class Circle extends Shape{

	int radius=10;
	@Override
	double area() {
		// TODO Auto-generated method stub
		return  Math.PI*radius*radius;
	}
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
}

class Rectangle extends Shape
{
	double length=5,breadth=5;

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2*length+breadth	;
	}
	

}
public class Ex3_shape_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		Shape rectangle = new Rectangle();
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
		

	}

}
