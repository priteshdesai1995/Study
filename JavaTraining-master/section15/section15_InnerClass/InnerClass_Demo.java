package section15_InnerClass;

class Outer {
	int x = 10;

	class Inner {
		int y = 20;

		void innerDisp() {
			// Inner Class can access member of outer class;
			System.out.println(x);
			System.out.println(y);
		}
	}

	void outerDisp() {
		// int b=y; cannot access member of inner class due to scope.
		Inner i = new Inner(); // Object of inner class to access member and methods of inner class.
		i.innerDisp();
		System.out.println(i.y);
	}
}

public class InnerClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.outerDisp();

		// Other way
		Outer.Inner OI = new Outer().new Inner();
		OI.innerDisp();

	}

}
