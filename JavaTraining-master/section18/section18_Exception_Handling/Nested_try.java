package section18_Exception_Handling;

public class Nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int A[] = { 1, 0, 2, 3, 4 };
			try {
				int res = A[3] / A[1];
				System.out.println("Result" + res);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				System.out.println("value at index" + A[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
				System.out.println("End");
		}
		System.out.println("Program at end");

	}

}
