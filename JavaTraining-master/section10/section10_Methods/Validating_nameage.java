	package section10_Methods;

public class Validating_nameage {

	static boolean validate(String name)
	{
		 return name.matches("[a-zA-Z\\s]+");	
	}
	
	static boolean validate(int age)
	{
		if(age>3 && age<15)
		{
			return true;	
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate("swap");
		validate(24);
		
	}

}
