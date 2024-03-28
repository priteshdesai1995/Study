package section15_InnerClass;

class outerStatic
{
	static  int x=10;
			int y=20;
			
			static class innersSatic
			{
				public 	void innerDisp()
				{
					System.out.println(x);
				//	System.out.println(y); 		// Only static members can be accessed.
				}
			}
}
public class StaticClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerStatic.innersSatic oi = new outerStatic.innersSatic();
		oi.innerDisp();

	}

}
