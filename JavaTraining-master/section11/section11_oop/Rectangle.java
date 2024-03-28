package section11_oop;

public class Rectangle {

	private int height;
	private int breadth;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height>0) 	this.height = height;		//Validating height
		else 			this.height=0;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public Rectangle(int height, int breadth) {
		super();
		this.height = height;
		this.breadth = breadth;
	}

	// methods
	public double area() {
		return height * breadth;
	}

	public double perimeter() {
		return 2 * (height + breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", breadth=" + breadth + ", getHeight()=" + getHeight()
				+ ", getBreadth()=" + getBreadth() + ", area()=" + area() + ", perimeter()=" + perimeter() + "]";
	}

}
