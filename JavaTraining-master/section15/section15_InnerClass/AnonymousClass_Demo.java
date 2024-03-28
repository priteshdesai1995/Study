package section15_InnerClass;

abstract class Anonymous
{
		abstract public void adisp();
}

//Interface can also be used
interface IAnonymous
{
	public void Idisp();
}

class OuterAnonymousClass
{
	void outerDisp()
	{
		Anonymous A = new Anonymous()
				{

					@Override
					public void adisp() {
						// TODO Auto-generated method stub
						System.out.println("Abstract anonymous method");
						
					}
				};
				
				
			A.adisp();
			
			//Anonymous object/class that is inherting from class Anonymous
			new Anonymous()	
			{

				@Override
				public void adisp() {
					// TODO Auto-generated method stub
					System.out.println("Abstract anonymous method");
					
				}
			}.adisp();
			
			new IAnonymous()	
			{

				@Override
				public void Idisp() {
					// TODO Auto-generated method stub
					System.out.println("Interface method");
					
				}
			}.Idisp();
			
	
	}
}	

public class AnonymousClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterAnonymousClass oac = new OuterAnonymousClass();
		oac.outerDisp();
	}

}
