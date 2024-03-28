package section17_Package;

public class Using_them extends Acess_modifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acess_modifiers am = new Acess_modifiers();
		System.out.println(am.marks);		//its public can be accessed from anywhere
		//System.out.println(am.marks2);	//it cannot be accessed due to private(same pkg sub class only)
		System.out.println(am.marks3);		//its can be accessed bcause its protected(same pkg same class,sub class,nonsubclass,diff pkg sub class)
		
	}

}
