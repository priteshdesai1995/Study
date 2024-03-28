package section11_oop;

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

class cylinder {
	double radius;
	double height;

	public double lidArea() {
		return Math.PI * radius * radius;
	}

	public double totalSurfaceArea() {
		return 2 * lidArea() + circum() * height;
	}

	public double volume() {
		return height * lidArea();
	}

	public double circum() {
		return 2 * Math.PI * radius;
	}
}

public class RectangleClass_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle Rectangle = new rectangle();
		cylinder Cylinder = new cylinder();
		Rectangle.len = 10;
		Rectangle.bre = 20;
		Rectangle.area();
		System.out.println(Rectangle.perimeter());

		Cylinder.height = 12.5;
		Cylinder.radius = 10;
		System.out.println(Cylinder.lidArea());
		System.out.println(Cylinder.circum());
		System.out.println(Cylinder.totalSurfaceArea());
		System.out.println(Cylinder.volume());

	}

}
