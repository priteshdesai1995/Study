package section11_oop;

public class Rectangle_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(5, 6);
		rectangle.setHeight(-5);
		rectangle.setBreadth(20);
		rectangle.area();
		rectangle.perimeter();
		System.out.println(rectangle);

	}

}
