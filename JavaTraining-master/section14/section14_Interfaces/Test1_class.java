package section14_Interfaces;

class demo implements Test1
{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test 2");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Test 3");
	}
	
}
public class Test1_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 T = new demo();
		T.test2();
		T.test3();
	}

}
