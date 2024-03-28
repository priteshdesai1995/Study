package section15_InnerClass;

class OuterLocalClass
{
	 void outerDisp()
	{
		class InnerLocalClass
		{
			void innerDisp()
			{
				System.out.println("Inner Disp");
			}
		}	
		InnerLocalClass I = new InnerLocalClass();
		new InnerLocalClass().innerDisp();		//Anonymus Object
		I.innerDisp();	
	}
}
public class LocalClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterLocalClass olc = new OuterLocalClass();
		olc.outerDisp();
		
	}

}
